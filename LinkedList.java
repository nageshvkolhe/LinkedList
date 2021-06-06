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
	
	public void afterInsert(Node previousnode, int data) {
		if (head == null) {
			System.out.println("The given node previous can't null");
		return;
		}
		Node newNode= new Node (data);
		newNode.next = previousnode.next;
		previousnode.next = newNode;
		
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
		list.addNode(30);
		list.addNode(70);

		list.afterInsert(list.head.next,40);
		
		list.display();
	}
}
