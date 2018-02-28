package springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMarksMapper implements RowMapper<UserMarks>{

	@Override
	public UserMarks mapRow(ResultSet resultSet, int rowId) throws SQLException {
		UserMarks userMarks = new UserMarks();
		userMarks.setId(resultSet.getInt("user_id"));
		userMarks.setName(resultSet.getString("user_name"));
		userMarks.setAge(resultSet.getString("user_age"));
		userMarks.setUid(resultSet.getInt("uid"));
		userMarks.setYear(resultSet.getInt("year"));
		userMarks.setMarks(resultSet.getInt("marks"));
		return userMarks;
	}
	
}
