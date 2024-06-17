package collections_map3_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import collections_map.MapInterface;

public class PincodesLinkedHashMap implements MapInterface{
	Map<Integer, String> linkedHashMap;

	public void creationOfMap() {
		linkedHashMap=new LinkedHashMap<>();
		System.out.println("Linked-Hash-Map : ");
	}
	
	public void additionOfElements() {
		linkedHashMap.put(123450, "Chennai");
		linkedHashMap.put(123451, "Bangalore");
		linkedHashMap.put(123452, "Mumbai");
		linkedHashMap.put(123453, "Hyderabad");
		linkedHashMap.put(123454, "Vijayawada");
		linkedHashMap.put(123455, "Kolkatta");
		linkedHashMap.put(123456, "Delhi");
		linkedHashMap.put(123457, "Rajasthan");
	}
	
	public void retrievalOfMap() {
		System.out.println("\nRetrieval of keys and values : ");
		for(Entry<Integer, String> value: linkedHashMap.entrySet()) {
			System.out.println(value.getKey()+" >> "+value.getValue());
		}
	}

	public void deletionOfElements() {
		System.out.println("\nDelete 1st : "+linkedHashMap.remove(123450));
		System.out.println("Delete 8th : "+linkedHashMap.remove(123457, "Rajasthan"));
		System.out.println("After deletion : "+linkedHashMap);
	}
	
	public void verificationOfElements() {
		System.out.println("\nVerify 1st : "+linkedHashMap.get(123450)+" >> "+linkedHashMap.containsKey(123450));
		System.out.println("Verify 4th : "+linkedHashMap.get(123453)+" >> "+linkedHashMap.containsValue("Hyderabad"));
	}
	
	public void updationOfElements() {
		System.out.println("\nUpdate 2nd : "+linkedHashMap.get(123451)+" >> "+linkedHashMap.replace(123451, "Gujarath"));
		System.out.println("Update 5th : "+linkedHashMap.get(123454)+" >> "+linkedHashMap.replace(123454, "Vijayawada", "Guntur"));
		System.out.println("After updation : "+linkedHashMap);
	}
	
	public void otherMethods() {
		System.out.println("\nSize of a map : "+linkedHashMap.size());
//		linkedHashMap.clear();
//		System.out.println("Linked hash-map clear : "+linkedHashMap);
		System.out.println("Is linked-hash-map empty : "+linkedHashMap.isEmpty());
		System.out.println("Key set : "+linkedHashMap.keySet());
	}

}