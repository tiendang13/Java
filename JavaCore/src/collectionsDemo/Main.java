package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String names[] = {"nam","thong", "thi", "tien", "binh", "nhan", "anh"}; 
		List<String> nameList = new ArrayList<String>();
		List<String> doList = new ArrayList<String>();
		for(int i = 0; i<names.length; i++){
			nameList.add(names[i]);
		}
		System.out.println("Name list: " + nameList.toString());
		
		Collections.sort(nameList);
		System.out.println("Name list after sort: " + nameList.toString());
		
		Collections.shuffle(nameList);
		System.out.println("Name list after shuffle: " + nameList.toString());
		
		System.out.println("Max: " + Collections.max(nameList));
		System.out.println("Min: " + Collections.min(nameList));
		
		Collections.replaceAll(nameList, "thi", "thi bien thai");
		System.out.println("Name list: " + nameList.toString());
		
		nameList = Collections.emptyList();
		System.out.println("Name list = empty list: " + nameList.toString());
		
		Collections.addAll(doList, "an", "uong", "ngu", "code");
		System.out.println("Do list: " + doList.toString());
		
		
		//Collections.copy(nameList, doList);
		//chua thuc hien duoc ham copy
	}

}
