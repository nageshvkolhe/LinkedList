package com.linkedlist;

public class LinkedList {
	public Node head = null;
	public Node tail = null;

	class Node {
		int data;
		Node next;

		 Node(int data) {
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

	public void addNode(int data) {
		Node newNode= new Node (data);

		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;

		}
	}

	public Node getMiddleNode() {
		if(head == null) {
			return null;
		}
		Node slowPtr = head;
		Node fastPtr = head;

		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
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

		list.addNode(56);
		list.addNode(70);
		list.addNode(30);

		list.display();
				
		Node middleNode = list.getMiddleNode();
		System.out.println("middlenode is " +  middleNode.data);
	}
}
