package mapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();
		
		hashMap.put(1, "number 1");
		hashMap.put(2, "number 2");
		hashMap.put(3, "number 3");
		
		System.out.println(hashMap.toString());
		if(hashMap.isEmpty()){
			System.out.println("Hash Map is empty");
		}else{
			System.out.println("Hash Map is not empty");
		};
		String num2 = new String();
		num2 = hashMap.get(2);
		System.out.println("Key: 2, value: " + num2);
		
		hashMap.remove(1);
		System.out.println("Hash Map after remove: " + hashMap.toString());
	}

}
