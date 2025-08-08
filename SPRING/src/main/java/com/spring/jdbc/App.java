package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {

	public static void main(String[] args) {
		System.out.println("my program started.......");
		//spring jdbc->jdbcTemplate
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/jdbcConfig.xml");
		JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
		StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
		
		//INSERT DATA
		Student student = new Student();
		student.setSid(105);
		student.setName("sai raddy");
		student.setCity("benglore");
		int result = studentDao.insert(student);
		System.out.println("student added : " + result);
 	     
		
		//UPDATE DATA
//	     Student student=new Student();
//	     student.setSid(1);
//	     student.setName("arjit sing");
//	     student.setCity("mumbie");
//	     int result=studentDao.change(student);
//	     System.out.println("data changed : "+result);
		
		
		//DELETE DATA
//		int result= studentDao.delete(1);
//		System.out.println("deleted row :"+result);
		
		//select data from data base(only for single row)
//		Student student=studentDao.getStudent(555);
//		System.out.println(student);
//		
		
		//SELECT MULTIPLE DATA FROM DATABASE(MULTIPLE ROW)
		
		List<Student> students=studentDao.getAllStudent();
		for(Student s:students)
		{
			System.out.println(s);
		}
		
		
		
	}

}
