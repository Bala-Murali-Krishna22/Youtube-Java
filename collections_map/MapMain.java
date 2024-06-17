package collections_map;

import java.util.Scanner;

import collections_map1_HashMap.StudentAbstract;
import collections_map1_HashMap.StudentsHashMap;
import collections_map2_HashTable.EmployeesHashTable;
import collections_map3_LinkedHashMap.PincodesLinkedHashMap;
import collections_map4_TreeMap.SubjectScoresTreeMap;

public class MapMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		new MapMain().hashMap();
//		new MapMain().hashTable();
//		new MapMain().linkedHashMap();
//		new MapMain().treeMap();
		
	}
//	###1
	public void hashMap() {
		StudentAbstract studentsHashMap=new StudentsHashMap();
		studentsHashMap.creationOfMap();
		studentsHashMap.additionOfElements();
		studentsHashMap.retrievalOfMap();
		studentsHashMap.deletionOfElements();
		studentsHashMap.verificationOfElements();
		studentsHashMap.updationOfElements();
		studentsHashMap.otherMethods();
//		###
		studentsHashMap.retrievalOfKeys();
		studentsHashMap.retrievalOfValues();
		studentsHashMap.retrievalOfValuesKeys();
	}
//	###2
	public void hashTable() {
		MapInterface employeesHashTable=new EmployeesHashTable();
		employeesHashTable.creationOfMap();
		employeesHashTable.additionOfElements();
		employeesHashTable.retrievalOfMap();
		employeesHashTable.deletionOfElements();
		employeesHashTable.verificationOfElements();
		employeesHashTable.updationOfElements();
		employeesHashTable.otherMethods();
	}
//	###3
	public void linkedHashMap() {
		MapInterface pincodesLinkedHashMap=new PincodesLinkedHashMap();
		pincodesLinkedHashMap.creationOfMap();
		pincodesLinkedHashMap.additionOfElements();
		pincodesLinkedHashMap.retrievalOfMap();
		pincodesLinkedHashMap.deletionOfElements();
		pincodesLinkedHashMap.verificationOfElements();
		pincodesLinkedHashMap.updationOfElements();
		pincodesLinkedHashMap.otherMethods();
	}
//	###4
	public void treeMap() {
		MapInterface subjectScoresTreeMap=new SubjectScoresTreeMap();
		subjectScoresTreeMap.creationOfMap();
		subjectScoresTreeMap.additionOfElements();
		subjectScoresTreeMap.retrievalOfMap();
		subjectScoresTreeMap.deletionOfElements();
		subjectScoresTreeMap.verificationOfElements();
		subjectScoresTreeMap.updationOfElements();
		subjectScoresTreeMap.otherMethods();
	}
//	###
}
