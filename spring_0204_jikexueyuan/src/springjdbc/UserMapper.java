package springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet resultSet, int rowId) throws SQLException {
		User user = new User();
		user.setId(resultSet.getInt("user_id"));
		user.setName(resultSet.getString("user_name"));
		user.setAge(resultSet.getString("user_age"));
		return user;
	}
	
}
