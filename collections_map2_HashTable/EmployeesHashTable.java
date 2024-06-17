package collections_map2_HashTable;

import collections_map.MapInterface;

import java.util.*;
import java.util.Map.Entry;

public class EmployeesHashTable implements MapInterface{
	Map<Integer, String[]> hashTable;
	
	public void creationOfMap() {
		hashTable=new Hashtable<>();
		System.out.println("Hash table : ");
	}

	public void additionOfElements() {
		hashTable.put(101, new String[]{"Balu","First"});
		hashTable.put(102, new String[]{"Ball","Second"});
		hashTable.put(103, new String[]{"Murali","Three"});
		hashTable.put(104, new String[]{"Krishna","Four"});
		hashTable.put(105, new String[]{"Bmk","Five"});
		hashTable.put(106, new String[]{"Bmk22","Six"});
		hashTable.put(107, new String[]{"BMKrishna","Seven"});
		hashTable.put(108, new String[]{"BalaMK","Eight"});
		hashTable.put(109, new String[]{"BMuraliK","Nine"});
		hashTable.put(110, new String[]{"Balu22","Ten"});
	}
	
	public void retrievalOfMap() {
		Collection<Entry<Integer,String[]>> values=hashTable.entrySet();
		for(Entry<Integer,String[]> value: values) {
			System.out.println(value.getKey()+" >> "+Arrays.toString(value.getValue()));
		}
	}

	public void deletionOfElements() {
		System.out.println("\nDelete 1st : "+Arrays.toString(hashTable.remove(101)));
//		System.out.println("Delete 10th : "+Arrays.toString(hashTable.remove(110, new String[]{"Balu22","Ten"})));
		System.out.println("Delete 10th : "+Arrays.toString(hashTable.remove(110)));
		System.out.println("After deletion : ");
		retrievalOfMap();
	}
	
	public void verificationOfElements() {
		System.out.println("\nVerify 1st : "+hashTable.containsKey(101));
		System.out.println("Verify 2nd : "+hashTable.containsKey(102));
		System.out.println("Verify 5th : "+hashTable.containsKey(105));
//		System.out.println("Verify 5th : "+hashTable.containsValue(new String[]{"Bmk","Five"}));
	}

	public void updationOfElements() {
		System.out.println("\nUpdate 2nd : "+hashTable.replace(102, new String[]{"Ball2","Five2"}));
		System.out.println("Update 7th : "+hashTable.put(107, new String[]{"BMKrishna7","Seven7"}));
		System.out.println("After updatipn : ");
		retrievalOfMap();
	}
	
	public void otherMethods() {
		System.out.println("\nHash map size : "+hashTable.size());
//		hashTable.clear();
//		System.out.println("Hash map clear : "+hashTable);
		System.out.println("Get key of 5th : "+Arrays.toString(hashTable.get(105)));
		System.out.println("Is hash-table empty : "+hashTable.isEmpty());
		System.out.println("Key set : "+hashTable.keySet());
	}

}
