package iteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		List<String> nameArrayList = new ArrayList<String>();
		
		nameArrayList.add("tien");
		nameArrayList.add("thong");
		nameArrayList.add("thi");
		
		System.out.println("List ban dau: ");
		Iterator<String> iter = nameArrayList.iterator();
		while(iter.hasNext()){
			System.out.println("Elements: " + iter.next());
		}
		
		ListIterator<String> liter = nameArrayList.listIterator();
		while(liter.hasNext()){
			liter.set("fresher " + liter.next());
		}
		
		System.out.println("List sau khi sua doi: ");
		iter = nameArrayList.iterator();
		while(iter.hasNext()){
			System.out.println("Elements: " + iter.next());
		}
		
		System.out.println("List in nguoc lai: ");
		while(liter.hasPrevious()){
			System.out.println("Elements: " + liter.previous());
		}
		
	}

}
