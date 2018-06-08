package com.tien;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MainClass {

	public static Student getByID(int id, SqlSession session) throws IOException {
		Student student = (Student)session.selectOne("Student.getById", id);        	            	
		return student;
	}
	public static List<Student> getAll(SqlSession session) {
		List<Student> student = session.selectList("Student.getAll");
		return student;
	}
	public static void update(Student student, SqlSession session) {
	    session.update("Student.update",student);
	}
	public static void insert(Student student, SqlSession session) {
	    session.insert("Student.insert",student);
	}
	public static void delete(int id, SqlSession session) {
	    session.delete("Student.deleteById", id);
	}
	public static void main(String args[]) throws IOException{
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		
		List<Student> studentList = getAll(session);
		for(Student st : studentList) {
			System.out.println(st.toString());
		}
		
		Student student1 = getByID(1, session);
		System.out.println(student1.toString());
		
		Student newStudent = new Student(3, "Bùi Quang Trung", "KHMT2014");
//		update(student, session);
//		delete(1, session);
//		insert(newStudent, session);
	    System.out.println("Record updated successfully");   
	    session.commit();   
	    session.close();	  
	   }
}
