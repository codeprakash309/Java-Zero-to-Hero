package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//       Student student=new Student(777,"madhuwala","himgir");
//       int r = studentDao.insert(student);
//       System.out.println("done.."+r);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		
		while (go) {
			System.out.println("PRESS 1 for add new student");
			System.out.println("PRESS 2 for display all students");
			System.out.println("PRESS 3 for get details of single student");
			System.out.println("PRESS 4 for delete students");
			System.out.println("PRESS 5 for update student");
			System.out.println("PRESS 6 for EXIST");
			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
                    //add a new student
					//taking input from user
					System.out.print("Enter student id : ");
					int sId=Integer.parseInt(br.readLine());
					
					System.out.print("Enter student name : ");
					String name=br.readLine();
					
					System.out.print("Enter Student city : ");
					String city=br.readLine();
					//creating student object and setting values
					Student s=new Student();
					s.setStudentId(sId);
					s.setStudentName(name);
					s.setStudentCity(city);
					//using student object to database by calling insert of studentDao
					int r=studentDao.insert(s);
					System.out.println(r+" Student Added");
					System.out.println("*********************************");
					System.out.println();
					break;
				case 2:
                     //display all student
					System.out.println("***********************************");
					List<Student> st=studentDao.getAllStudent();
					for(Student s1:st) {
						System.out.print("Id  : "+s1.getStudentId()+"\n");					
						System.out.print("Name : "+s1.getStudentName()+"\n");
						System.out.print("City : "+s1.getStudentCity()+"\n");
						System.out.println("___________________________________");
						}
					System.out.println("***********************************");
					
					break;
				case 3:
                     //get single student data
					System.out.print("Enter the student Id to display student details : ");
					int id=Integer.parseInt(br.readLine());
					Student s2=studentDao.getStudent(id);
					System.out.println("_________________________________");
					System.out.println();
					System.out.println("Id : "+s2.getStudentId());
					System.out.println("Name : "+s2.getStudentName());
					System.out.println("City : "+s2.getStudentCity());
					System.out.println("__________________________________");
					break;
				case 4:
					 //for delete student
					System.out.print("Enter the student Id to delete student : ");
					int id2=Integer.parseInt(br.readLine());
					studentDao.deleteStudent(id2);
					System.out.println("Student deleted!....");
					break;
				case 5:
					 //update student	
					System.out.print("Enter the Student Id to update the student : ");
					 
					 
					
					break;
				case 6:
					//exist
					go=false;
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid Input try with another one !....");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thank you for using my application ");
		System.out.println("see you soon!....");

	}
}
