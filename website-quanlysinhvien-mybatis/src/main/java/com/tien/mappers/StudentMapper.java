package com.tien.mappers;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tien.model.Student;

public class StudentMapper{

	public Student getByID(int id) throws IOException {
		Reader reader = Resources.getResourceAsReader("student-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		Student student = (Student)session.selectOne("Student.getById", id);   
		session.commit();   
		session.close();
		return student;
	}
	public List<Student> getAll() throws IOException {
		Reader reader = Resources.getResourceAsReader("student-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		List<Student> student = session.selectList("Student.getAll");
		session.commit();   
		session.close();
		return student;
	}
	public void deleteById(int id) throws IOException {
		Reader reader = Resources.getResourceAsReader("student-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		session.delete("Student.deleteStudent", id);
		session.insert("Student.deleteInfo", id);
		session.commit();   
		session.close();
	}
	public void insert(Student student) throws IOException {
		Reader reader = Resources.getResourceAsReader("student-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		session.insert("Student.insertStudent",student);
		session.insert("Student.insertInfo",student);
		session.commit();   
		session.close();
	}
	public void update(Student student) throws IOException {
		Reader reader = Resources.getResourceAsReader("student-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		session.update("Student.updateStudent", student);
		session.insert("Student.updateInfo",student);
		session.commit();   
		session.close();
	}
}
