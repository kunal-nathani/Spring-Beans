package com.kunal.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kunal.model.Student;


@Component("stDao")
public class StudentDaoimpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String sql = "insert into student(id,name,address) values(?,?,?)";
		int i = jdbcTemplate.update(sql, student.getId(), student.getName(), student.getAddress());
		return i;
	}

	@Override
	public int UpdateDetails(Student student) {
		// TODO Auto-generated method stub
		String sql = "update student set name=? , address=? where id=?";
		int i = jdbcTemplate.update(sql, student.getName(), student.getAddress(), student.getId());

		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from student where id=?";
		int i = jdbcTemplate.update(sql, id);
		return i;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from student where id=?";
		RowMapper rowMapper = new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddress(rs.getString(3));

				return st;
			}

		};
		Student st =  (Student) jdbcTemplate.queryForObject(sql, rowMapper, id);
		return st;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		String sql = "select * from student";

		RowMapper rowMapper = new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddress(rs.getString(3));

				return st;
			}
		};
		List<Student> list = jdbcTemplate.query(sql, rowMapper);
		return list;
	}

//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
}
