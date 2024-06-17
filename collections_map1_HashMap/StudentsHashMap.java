package collections_map1_HashMap;

import java.util.*;
import java.util.Map.Entry;

public class StudentsHashMap extends StudentAbstract {
	Map<Integer, String> hashMap;

	public void creationOfMap() {
		hashMap=new HashMap<>();
		System.out.println("Hash map : ");
	}

	public void additionOfElements() {
		hashMap.put(1, "Aba");
		hashMap.put(2, "Abb");
		hashMap.put(3, "Abc");
		hashMap.put(4, "Abd");
		hashMap.put(5, "Abe");
		hashMap.put(6, "Abf");
		hashMap.put(7, "Abg");
	}

	public void retrievalOfMap() {
		System.out.println("Retrieval of keys and values : ");
		Collection<Entry<Integer, String>> values=hashMap.entrySet();
		for (Entry<Integer, String> value : values) {
			System.out.println(value.getKey()+" >> "+value.getValue());
		}
	}

	public void deletionOfElements() {
		System.out.println("\nDelete 4th : "+hashMap.remove(4));
		System.out.println("Delete 7th : "+hashMap.remove(7, "Abg"));
		System.out.println("After deletion : "+hashMap);
	}

	public void verificationOfElements() {
		System.out.println("\nVerify 3rd : "+hashMap.containsKey(3));
		System.out.println("Verify 4th : "+hashMap.containsValue("Abd"));
	}

	public void updationOfElements() {
		System.out.println("\nUpdate 1st : "+hashMap.replace(1, "Ab1"));
		System.out.println("Update 3rd : "+hashMap.replace(3, "Abc", "Ab3"));
		System.out.println("Update 2nd : "+hashMap.put(2, "Ab2"));
		System.out.println("After updation : "+hashMap);
	}

	public void otherMethods() {
		System.out.println("\nHash map size : "+hashMap.size());
//		hashMap.clear();
//		System.out.println("Hash map clear : "+hashMap);
		System.out.println("Get key of 1st : "+hashMap.get(1));
		System.out.println("Is hashMap empty : "+hashMap.isEmpty());
		System.out.println("Retrieve using entryset methos : "+hashMap.entrySet());
	}
	
//	### For practice
	public void retrievalOfKeys() {
		System.out.println("\nFor practice : \nRetrieval of keys : ");
		Collection<Integer> keys=hashMap.keySet();
		for(Integer key: keys) {
			System.out.print(key+" ");
		}
	}

	public void retrievalOfValues() {
		System.out.println("\n\nRetrieval of values : ");
		Collection<String> values=hashMap.values();
		for(String value: values) {
			System.out.print(value+" ");
		}
	}

	public void retrievalOfValuesKeys() {
		System.out.println("\n\nRetrieval of map : "+hashMap);
	}

}
