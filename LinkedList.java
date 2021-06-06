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

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	public void appened (int data) {
		Node newNode= new Node (data);
		if (this.head == null ||this.tail == null ) {
			this.head = newNode;
			this.tail =newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
			
		}
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

		LinkedList list = new LinkedList();
		
		list.appened(56);
		list.appened(30);
		list.appened(70);
	
		list.display();
	}
}
