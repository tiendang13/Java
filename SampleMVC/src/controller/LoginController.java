package controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.User;

@Controller
public class LoginController {
	private ApplicationContext context = null;
	private ConnectData connect = null;
	
	public LoginController(){
		context = new ClassPathXmlApplicationContext("Beans.xml");
		connect = (ConnectData) context.getBean("connectData");
	}
	 @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	    public String checkUser(@ModelAttribute User user, ModelMap model) {
	        if (connect.checkLogin(user)) {
	            List<User> listUsers = connect.listUsers();
	            model.put("userList", listUsers);
	            model.put("user", new User());
	            return "home";
	        }
	        return "loginerror";
	    }
}
