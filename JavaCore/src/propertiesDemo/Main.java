package propertiesDemo;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Properties p = new Properties();
		String str;
		Set s;
		  
		p.put("Illinois", "Springfield");
		p.put("Missouri", "Jefferson City");
		p.put("Washington", "Olympia");
		p.put("California", "Sacramento");
		p.put("Indiana", "Indianapolis");
		
		s = p.keySet();
		Iterator i = s.iterator();
		while(i.hasNext()){
			str = (String) i.next();
			System.out.println("Thu do cua " + str + " la " + p.getProperty(str));
		}
		
		str = "Florida";
		System.out.println("Thu do cua " + str + " la " + p.getProperty(str, "Not found"));
	}

}
