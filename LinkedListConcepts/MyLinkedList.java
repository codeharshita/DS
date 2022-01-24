package LinkedListConcepts;

public class MyLinkedList {
	
	
	Node head;
	
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public void printMyLinkedList() {
		Node n = head;
		// Start traversing the LinkedList
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;// Counter shift to the next of node.
		}
	}

	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();// this is not the static  class so object has to be accessed by  the reference name. 
	
		
		Node first=ll.new Node(10);// Creating a node
		ll.head=first;//Mapping the node to next node.
		
		Node second =ll.new Node(20);
		first.next=second;
		
		Node third = ll.new Node(60);
		second.next=third;
		
		Node fourth = ll.new Node(100);
		third.next=fourth;
		
		
		Node fifth = ll.new Node(130);
		fourth.next=fifth;
		
		
		Node sixth = ll.new Node(140);
		fifth.next=sixth;

		ll.printMyLinkedList();// calling method,
		
		

	}

}
