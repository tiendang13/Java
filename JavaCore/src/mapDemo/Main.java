package mapDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();
		//Hashtable hashTable;
		
		hashMap.put(1, "number 1");
		hashMap.put(2, "number 2");
		hashMap.put(3, "number 3");
		//hashTable = new Hashtable(hashMap);
		Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
		System.out.println("Entry Set Hash Map: " + entrySet.toString());
		
		treeMap.put(6, "number 2");
		treeMap.put(5, "number 5");
		treeMap.put(3, "number 3");
		System.out.println("Tree Map: " + treeMap.toString());
		
		linkedHashMap.put(3, "Anh Van");
		linkedHashMap.put(2, "Tieng Viet");
		linkedHashMap.put(1, "Toan Hoc");
		System.out.println("Linked Hash Map: " + linkedHashMap.toString());

		
		
		if(hashMap.isEmpty()){
			System.out.println("Hash Map is empty");
		}else{
			System.out.println("Hash Map is not empty");
		};
		String num2 = new String();
		num2 = hashMap.get(2);
		System.out.println("HashmMap: Key = 2, value = " + num2);
		
		hashMap.remove(1);
		System.out.println("Hash Map after remove key 1a: " + hashMap.toString());
		
		Set<Integer> keySet = treeMap.keySet();
		System.out.println("TreeMap's key set: " + keySet);
		
		
		//hashTable.put(9, "number 9");
		//System.out.println("Hash Table: " + hashTable.toString());
		
	}

}
