package collections_list;

import collections_list1_Vector.AnimalsVector;
import collections_list2_ArrayList.NumbersArrayList;
import collections_list3_Stack.BooksAbstract;
import collections_list3_Stack.BooksStack;
import collections_list4_LinkedList.RailwaysLinkedList;

public class ListMain {
	public static void main(String[] args) throws NullPointerException{
		ListMain listMain=new ListMain();
//		System.out.println("********** Vector : **********");
//		listMain.vector();
		System.out.println("\n********** ArrayList : **********");
		listMain.arrayList();
//		System.out.println("\n********** Stack : **********");
//		listMain.stack();
//		System.out.println("\n **********LinkedList : **********");
//		listMain.linkedList();
	}
	
	public void vector() {
		ListInterface animalsVector=new AnimalsVector();
		animalsVector.createList();
		animalsVector.addToList();
		animalsVector.retrieveList();
		animalsVector.deletionList();
		animalsVector.updateList();
		animalsVector.verifyList();
		animalsVector.otherMethods();
	}
	
	public void arrayList() {
		ListInterface numbersArrayList=new NumbersArrayList();
		numbersArrayList.createList();
		numbersArrayList.addToList();
		numbersArrayList.retrieveList();
		numbersArrayList.deletionList();
		numbersArrayList.updateList();
		numbersArrayList.verifyList();
		numbersArrayList.otherMethods();
	}
	
	public void stack() {
		BooksAbstract booksAbstract=new BooksStack();
		booksAbstract.createList();
//		booksAbstract.addToList();
		booksAbstract.push();
		booksAbstract.retrieveList();
		booksAbstract.deletionList();
		booksAbstract.updateList();
		booksAbstract.verifyList();
		booksAbstract.otherMethods();
		booksAbstract.peek();
		booksAbstract.search();
		booksAbstract.pop();
	}
	
	public void linkedList() {
		ListInterface railwaysLinkedList=new RailwaysLinkedList();
		railwaysLinkedList.createList();
		railwaysLinkedList.addToList();
		railwaysLinkedList.retrieveList();
		railwaysLinkedList.deletionList();
		railwaysLinkedList.updateList();
		railwaysLinkedList.verifyList();
		railwaysLinkedList.otherMethods();
	}
	
}