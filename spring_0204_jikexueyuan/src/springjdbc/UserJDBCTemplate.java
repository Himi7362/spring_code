package springjdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class UserJDBCTemplate implements UserDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTempObj;
	private PlatformTransactionManager transactionManager;

	@Override
	public void setDataSource(DataSource datasource) {
		this.dataSource = datasource;
		this.jdbcTempObj = new JdbcTemplate(datasource);
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public User getUser(int id) {
		String sql = "SELECT * FROM t_user WHERE user_id = ?";
		User user = jdbcTempObj.queryForObject(sql, new Object[] { id },
				new UserMapper());
		return user;
	}

	@Override
	public List<UserMarks> listUser() {
		String sql = "SELECT * FROM t_user a,user_marks b where a.user_id =b.uid";
		List<UserMarks> userMarks = jdbcTempObj.query(sql, new UserMarksMapper());
		return userMarks;
	}

	@Override
	public void create(String name, String age) {
		String sql = "insert into t_user(user_name,user_age) values(?,?)";
		System.out.println("添加一条记录" + new User(name, age).toString());
		jdbcTempObj.update(sql, name, age);
	}

	@Override
	public int delete(int id) {
		String sql = "delete from t_user where user_id = ?";
		System.out.println("删除一条记录");
		return jdbcTempObj.update(sql, id);
	}

	@Override
	public int update(int id, String name) {
		String sql = "update t_user set user_name=? where user_id =?";
		return jdbcTempObj.update(sql, name, id);
	}

	@Override
	public void addMarksUser(String name, String age, int year, int marks) {
		TransactionDefinition dtd = new DefaultTransactionDefinition();
		TransactionStatus status  = transactionManager.getTransaction(dtd);
		try {
			String preSQL = "set autocommit =off";//关闭mysql自动提交功能
			jdbcTempObj.execute(preSQL);
			String sql = "insert into t_user(user_name,user_age) values (?,?)";
			jdbcTempObj.update(sql, name,age);
			String sql2 = "select max(user_id) from t_user";
			int sid = jdbcTempObj.queryForObject(sql2, Integer.class);
			String sql3 = "insert into user_marks(uid,year,marks) values(?,?,?)";
			int i = 1/0;
			jdbcTempObj.update(sql3,sid,year,marks);
			transactionManager.commit(status);
			System.out.println("marks user has added !");
		} catch (Exception e) {
			transactionManager.rollback(status);
			System.out.println("marks user add error!"+e.getMessage()+" rollback ~");
		}
	}

}
