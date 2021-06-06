package com.linkedlist;

public class LinkedListUC5 {
	public static Node head = null;
	public Node tail = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}


	public void addNode(int data) {
		Node newNode= new Node (data);

		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;

		}
	}

	public Node DeletFirstNode() {
		if (head == null)
			return head;
		Node temp = head ;
		head = head.next;
		return head;
	}

	public void display() {
		Node tempNode = head;
		Node current = head;
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Singly LinkedList of Node");
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		LinkedListUC5 list = new LinkedListUC5();

		list.addNode(56);
		list.addNode(30);
		list.addNode(70);
      
		list.display();

		list.DeletFirstNode();
	
		System.out.println("After Deletion of the element");
		list.display();
	}
}
