package collections_map4_TreeMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

import collections_map.MapInterface;

public class SubjectScoresTreeMap implements MapInterface{
	Map<String, Integer> treeMap;
	
	public void creationOfMap() {
		treeMap=new TreeMap<>();
		System.out.println("tree-map : ");
	}

	public void additionOfElements() {
		treeMap.put("Telugu", 8);
		treeMap.put("Hindi", 7);
		treeMap.put("English", 6);
		treeMap.put("Maths", 10);
		treeMap.put("Physics", 4);
		treeMap.put("Biology", 5);
		treeMap.put("Social", 9);
	}
	
	public void retrievalOfMap() {
		for(Entry<String, Integer> values: treeMap.entrySet()) {
			System.out.println(values.getKey()+" >> "+values.getValue());
		}
	}

	public void deletionOfElements() {
		System.out.println("\nDelete Telugu value : "+treeMap.remove("Telugu"));
		System.out.println("Delete Social value : "+treeMap.remove("Social", 9));
		System.out.println("After deletion : "+treeMap);
	}
	
	public void verificationOfElements() {
		System.out.println("\nVerify Maths : "+treeMap.get("Maths")+" >> "+treeMap.containsKey("Maths"));
		System.out.println("Verify Telugu : "+treeMap.get("Telugu")+" >> "+treeMap.containsValue(8));
	}
	
	public void updationOfElements() {
		System.out.println("\nUpdate Physics : "+treeMap.get("Physics")+" >> "+treeMap.replace("Physics", 3));
		System.out.println("Update Biology : "+treeMap.get("Biology")+" >> "+treeMap.replace("Biology", 5, 1));
		System.out.println("After updation : "+treeMap);
	}

	public void otherMethods() {
		System.out.println("\nSize of a map : "+treeMap.size());
//		treeMap.clear();
//		System.out.println("Linked hash-map clear : "+treeMap);
		System.out.println("Is linked-hash-map empty : "+treeMap.isEmpty());
		System.out.println("Key set : "+treeMap.keySet());
	}

}