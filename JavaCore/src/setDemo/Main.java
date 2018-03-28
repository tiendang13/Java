package setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> treeSet= new TreeSet<Integer>();
		Set<Integer> linkedHashSet= new LinkedHashSet<Integer>();
		
		int dataHashSet[] = {12, 25, 84, 42, 11};
		int dataTreeSet[] = {55, 47, 22, 14, 36};
		int dataLinkedHashSet[] = {15, 16, 24,1, 32};
		
		for(int i = 0; i < 5; i++){
			hashSet.add(dataHashSet[i]);
			treeSet.add(dataTreeSet[i]);
			linkedHashSet.add(dataLinkedHashSet[i]);
		}
		
		System.out.println("Hash Set: " + hashSet.toString());
		System.out.println("Tree Set (sorted set): " + treeSet.toString());
		System.out.println("Linked Hash Set: " + linkedHashSet.toString());
		
		System.out.println("Hash Code: " + hashSet.hashCode());
		
		System.out.println("Is Hash Set contains 55: " + hashSet.contains(55));
		System.out.println("Is Tree Set contains 55: " + treeSet.contains(55));
		
		
	}

}
