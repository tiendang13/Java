package vectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("Size ban dau " + v.size());
		System.out.println("Capacity ban dau: " + v.capacity());
		
		v.addElement(new String("tien"));
		v.addElement(new String("thi"));
		v.addElement(new String("thong"));
		System.out.println("Vector" + v.toString());
		System.out.println("Size: " + v.size());
		System.out.println("First element: " + v.firstElement());
		System.out.println("Last element: " + v.lastElement());
		
		if(v.contains("tien")){
			System.out.println("Vector contains 'tien'.");
		}else{
			System.out.println("Vector doesn't contain 'tien'.");
		}
		
		Enumeration<String> e = v.elements();
		System.out.println("Elements in vector: ");
		while(e.hasMoreElements()){
			System.out.println(e.nextElement() + " ");
		}
	}

}
