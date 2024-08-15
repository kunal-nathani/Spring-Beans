package com.kunal.SpringJDBC;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.kunal.DAO.StudentDao;
import com.kunal.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/kunal/SpringJDBC/config.xml");
//        JdbcTemplate jd=context.getBean("jdbcTemplate",JdbcTemplate.class);
//        System.out.println(jd.getDataSource().getConnection());
//        
//        String sql="insert into student(id,name,address) values(?,?,?)";
//        int i=jd.update(sql,1,"Kunal","India");
//        System.out.println("Success Inserted" +i);
//        
//        Insert
//        String sql="insert into student(id,name,address) values(?,?,?)";
//        int i=jd.update(sql,3,"Shubh","london");
//        System.out.println("Inserted sucessfully"+i);
        
//        Update
//        String sql="update student set name=? , address=? where id=?";
//        int i=jd.update(sql,"Naman","USA",1);
//        System.out.println("Inserted sucessfully"+i);
    
//      Delete
//      String sql="delete from student where id=?";
//      int i=jd.update(sql,3);
//      System.out.println("Deleted sucessfully"+i);
  
//       fetch data by id
//        String sql="select * from student where id=?";
//        RowMapper rowMapper=new RowMapper() {
//        	public Object mapRow(ResultSet rs,int rowNum) throws SQLException{
//        		String name=rs.getString(2);
//        		return name;
//        	}
//        };
//      String name=(String) jd.queryForObject(sql, rowMapper, 1);
//      System.out.println(name);
        
        
		/*
		 * String sql="select * from student"; RowMapper rowMapper=new RowMapper() {
		 * public Object mapRow(ResultSet rs,int rowNum) throws SQLException{ String
		 * name=rs.getString(2); return name; } }; List<String> list = jd.query(sql,
		 * rowMapper); for(String name :list) { System.out.println(name); }
		 * 
		 * perform DAO standard
		 */
        
        StudentDao dao = context.getBean("stDao",StudentDao.class);
//		 Insert
		  Student st =new Student(); st.setId(4); st.setName("NOOB");
		  st.setAddress("MUMBAI");
		  
		  int i = dao.insert(st); System.out.println("insert successful"+i);
		 

		/*update
		 * Student st =new Student(); st.setId(5); st.setName("Gunner op");
		 * st.setAddress("Goa1");
		 * 
		 * int i = dao.UpdateDetails(st); System.out.println("updated successful"+i);
		 */
        

        
		/*Delete data
		 * int i = dao.delete(5); System.out.println("Deleted successful"+i);
		 */
        
		/*Particulat data of student
		 * Student st = dao.getStudentById(2); System.out.println(st);
		 */
        
       List<Student> list = dao.getAllStudent();
       for(Student sts : list) {
       System.out.println(sts);
       }
    }
}
