package collections_queue;

import collections_queue1_PriorityQueue.TokensInHospitalPriority;
import collections_queue2_Deque.FruitsArrayDeque;
import collections_queue3_ArrayList.RanksLinkedList;

public class QueueMain {
	public static void main(String[] args) {
		
//		new QueueMain().priorityQueue();
//		new QueueMain().arrayDeque();
		new QueueMain().linkedList();
		
	}
//	###1
	public void priorityQueue() {
		QueueInterface tokensInHospitalPriority=new TokensInHospitalPriority();
		tokensInHospitalPriority.createQueue();
		tokensInHospitalPriority.additionOfQueue();
		tokensInHospitalPriority.retrievalOfQueue();
		tokensInHospitalPriority.deletionOfQueue();
		tokensInHospitalPriority.verificationOfQueue();
		tokensInHospitalPriority.otherMethods();
	}
//	###2
	public void arrayDeque() {
		QueueInterface fruitsArrayDeque=new FruitsArrayDeque();
		fruitsArrayDeque.createQueue();
		fruitsArrayDeque.additionOfQueue();
		fruitsArrayDeque.retrievalOfQueue();
		fruitsArrayDeque.deletionOfQueue();
		fruitsArrayDeque.verificationOfQueue();
		fruitsArrayDeque.otherMethods();
	}
//	###3
	public void linkedList() {
		QueueInterface ranksLinkedList=new RanksLinkedList();
		ranksLinkedList.createQueue();
		ranksLinkedList.additionOfQueue();
		ranksLinkedList.retrievalOfQueue();
		ranksLinkedList.deletionOfQueue();
		ranksLinkedList.verificationOfQueue();
		ranksLinkedList.otherMethods();
	}
//	###
}