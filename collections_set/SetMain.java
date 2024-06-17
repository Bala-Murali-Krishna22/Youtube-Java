package collections_set;

import collections_set1_hashSet.MobileNumberInHashSet;
import collections_set2_linkedHashSet.MoviesLinkedHashSet;
import collections_set3_treeSet.BirthMonthsTreeSet;

public class SetMain {
	public static void main(String[] args) {
		
//		new SetMain().hashSet();
//		new SetMain().linkedHashSet();
		new SetMain().treeSet();
		
	}
//	###1
	public void hashSet() {
		SetInterface mobileNumberInHashSet=new MobileNumberInHashSet();
		mobileNumberInHashSet.createSet();
		mobileNumberInHashSet.addValues();
		mobileNumberInHashSet.retrieveValues();
		mobileNumberInHashSet.deleteValues();
		mobileNumberInHashSet.verifyValues();
		mobileNumberInHashSet.otherMethods();
	}
//	###2
	public void linkedHashSet() {
		SetInterface moviesLinkedHashSet=new MoviesLinkedHashSet();
		moviesLinkedHashSet.createSet();
		moviesLinkedHashSet.addValues();
		moviesLinkedHashSet.retrieveValues();
		moviesLinkedHashSet.deleteValues();
		moviesLinkedHashSet.verifyValues();
		moviesLinkedHashSet.otherMethods();
	}
//	###3
	public void treeSet() {
		SetInterface birthMonthsTreeSet=new BirthMonthsTreeSet();
		birthMonthsTreeSet.createSet();
		birthMonthsTreeSet.addValues();
		birthMonthsTreeSet.retrieveValues();
		birthMonthsTreeSet.deleteValues();
		birthMonthsTreeSet.verifyValues();
		birthMonthsTreeSet.otherMethods();
	}
//	###
}