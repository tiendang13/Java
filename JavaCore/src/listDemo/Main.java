package listDemo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameArrayList = new ArrayList<String>();
		List<String> nameLinkedList = new LinkedList<String>();
		
		nameLinkedList.add("tien");
		nameLinkedList.add("thong");
		nameLinkedList.add("thi");
		
		nameArrayList.add("tien");
		nameArrayList.add("thong");
		nameArrayList.add("thi");
		
		System.out.println("Linked: " + nameLinkedList.toString());
		System.out.println("Array: " + nameArrayList.toString());
		
		nameLinkedList.remove(1);
		nameArrayList.remove(1);
		
		System.out.println("Linked after remove: " + nameLinkedList.toString());
		System.out.println("Array after remove: " + nameArrayList.toString());
		
		nameLinkedList.set(1, "thong");
		nameArrayList.set(1, "thong");
		
		System.out.println("Linked after set: " + nameLinkedList.toString());
		System.out.println("Array after set: " + nameArrayList.toString());
		
		String [] name = new String[2];
		nameArrayList.toArray(name);
		System.out.println("To Array: ");
		for(int i = 0; i<name.length; i++){
			System.out.print(name[i] + " ");
		}
		
		List<String>nameArrayList2 = new  ArrayList<String>();
		nameArrayList2.add("tien");
		nameArrayList2.add("thong");
		
		if(nameLinkedList.equals(nameArrayList2)) {
			System.out.println("Equal return true ");
		}
		else {
			System.out.println("Equal return false ");
		};
		
		
	}

}
