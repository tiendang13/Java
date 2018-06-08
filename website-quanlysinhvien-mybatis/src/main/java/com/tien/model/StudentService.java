package com.tien.model;

import java.io.IOException;
import java.io.Reader;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class StudentService {

	public static Student getByID(int id) throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		Student student = (Student)session.selectOne("Student.getById", id);   
		session.commit();   
		session.close();
		return student;
	}
	public static List<Student> getAll() throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		List<Student> student = session.selectList("Student.getAll");
		session.commit();   
		session.close();
		return student;
	}
	public static void deleteById(int id) throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		session.delete("Student.deleteById", id);
		session.commit();   
		session.close();
	}
	public static void insert(Student student) throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		session.insert("Student.insert",student);
		session.commit();   
		session.close();
	}
	public static void update(Student student) throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		session.update("Student.update", student);
		session.commit();   
		session.close();
	}
	public static void main(String args[]) throws IOException{
		
		//Get all student info
		System.out.println("Show all student info: ");
		List<Student> result = getAll();
		for(Student st : result ){    	  
	         System.out.println(st.toString()); 
	      }  
		
		//Get student info by Id
		System.out.println("Insert student ID to find: ");
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		Student student = getByID(n);
		System.out.println(student.toString()); 
		
//		//Insert new student
//        long millis = System.currentTimeMillis();
//        Date date = new Date(millis);
//		Student newStudent = new Student(1, "student name", "student code", "student address", 9.9, date);
//		System.out.println(newStudent.toString()); 
		
//		deleteById(1);
//		insert(newStudent);
//		update(newStudent);
	   }
}
