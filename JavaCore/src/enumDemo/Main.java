package enumDemo;

import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		hashTable.put("AV", "Anh Van");
		hashTable.put("TV", "Tieng Viet");
		hashTable.put("TH", "Toan Hoc");
		Enumeration<String> e = hashTable.elements();
		
		  while(e.hasMoreElements()){
		       System.out.println(e.nextElement());}
	}

}
