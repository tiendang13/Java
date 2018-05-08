package controller;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import model.User;

public class ConnectData {
	private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    public List<User> listUsers() {
        String SQL = "select * from table_user";
        List<User> users = jdbcTemplateObject.query(SQL,new UserMapper());
        return users;
    }
    
    public boolean checkLogin(User user){
    	String sql = "select * from table_user where user_name = ? and user_password = ?";
    	List<User> result = jdbcTemplateObject.query(sql, new Object[]{user.getUsername(), user.getPassword()}, new UserMapper());
    	if (result != null){
    		return true;
    	}
    	return false;
    }
}
