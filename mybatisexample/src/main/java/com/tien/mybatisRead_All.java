package com.tien;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class mybatisRead_All {

	public static Student getByID(int id, SqlSession session) throws IOException {
		Student student = (Student)session.selectOne("Student.getById", id);        	            	
		return student;
	}
	public static List<Student> getAll(SqlSession session) {
		List<Student> student = session.selectList("Student.getAll");
		return student;
	}
	public static void main(String args[]) throws IOException{
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		
		//Get all student info
		System.out.println("Show all student info: ");
		List<Student> result = getAll(session);
		for(Student st : result ){    	  
	         System.out.println(st.toString()); 
	      }  
		
		//Get student info by Id
		System.out.println("Insert your student ID: ");
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		Student student = getByID(n, session);
		System.out.println(student.toString()); 
		sc.close();
		session.commit();   
		session.close();
	   }
}
