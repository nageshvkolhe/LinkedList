package com.linkedlist;

public class LinkedList {

	public Node head = null;
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

	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Singly LinkedList of Node");
		while(current != null) {
			System.out.print(current.data + " " );
			current = current.next;
		}
	}

	public static void main(String[] args){
		LinkedListUC1 list = new LinkedListUC1();

		list.addNode(56);
		list.addNode(30);
		list.addNode(70);

		list.display();
	} 
}
