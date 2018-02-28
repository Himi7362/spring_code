package springjdbc;

import java.util.List;

import javax.sql.DataSource;

public interface UserDao {
	/**
	 * 
	 * @Title: setDataSource  
	 * @Description: 设置数据源
	 * @param @param datasource    
	 * @throws
	 */
	 void setDataSource(DataSource datasource);
	 User getUser(int id);
	public List<UserMarks> listUser();
	public void create(String name,String age);
	public int delete(int id);
	public int update(int id,String name);
	public void addMarksUser(String name,String age,int year,int marks);
}
