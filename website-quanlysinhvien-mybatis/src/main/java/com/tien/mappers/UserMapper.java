package com.tien.mappers;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tien.model.User;

public class UserMapper {

	public User getByName(int id) throws IOException {
		Reader reader = Resources.getResourceAsReader("user-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		User user = (User)session.selectOne("User.getById", id);   
		session.commit();   
		session.close();
		return user;
	}
	public List<User> getAll() throws IOException {
		Reader reader = Resources.getResourceAsReader("user-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		List<User> user = session.selectList("User.getAll");
		session.commit();   
		session.close();
		return user;
	}
	public void deleteByName(String name) throws IOException {
		Reader reader = Resources.getResourceAsReader("user-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		session.delete("User.deleteByName", name);
		session.commit();   
		session.close();
	}
	public void insert(User user) throws IOException {
		Reader reader = Resources.getResourceAsReader("user-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		session.insert("User.user",user);
		session.commit();   
		session.close();
	}
	public void update(User user) throws IOException {
		Reader reader = Resources.getResourceAsReader("user-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		SqlSession session = sqlSessionFactory.openSession();
		session.update("User.update", user);
		session.commit();   
		session.close();
	}
}
