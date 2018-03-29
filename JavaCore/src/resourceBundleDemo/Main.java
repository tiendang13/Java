package resourceBundleDemo;

import java.util.ResourceBundle;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		ResourceBundle resource = ResourceBundle.getBundle("resourceBundleDemo/pl");
		System.out.println(resource.getString("name"));
		
		Set<String> set = resource.keySet();
		System.out.println("Key set: " + set.toString());
		
		
	}

}
