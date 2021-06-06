package com.linkedlist;

public class LinkedList {
	public static Node new_node;
	public static Node head = null;
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

	 void sortedInsert(Node new_node)
	    {
	        Node current;

	        if (head == null || head.data >= new_node.data) {
	            new_node.next = head;
	            head = new_node;
	        }
	        else {
		        current = head; 
	            while (current.next != null && current.next.data < new_node.data)
	                current = current.next;
	 
	            new_node.next = current.next;
	            current.next = new_node;
	        }
	    }

	    Node newNode(int data)
	    {
	        Node x = new Node(data);
	        return x;
	    }
	
	 public void display() {
			Node tempNode = head;
			Node current = head;
			if(head == null) {
				System.out.println("List is Empty");
				return;
			}
			while(current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
	 
	 public static void main(String[] args) {
		
			LinkedList list = new LinkedList();
			
				
				
		        new_node = list.newNode(56);
		        list.sortedInsert(new_node);
		        new_node = list.newNode(30);
		        list.sortedInsert(new_node);
		        new_node = list.newNode(40);
		        list.sortedInsert(new_node);
		        new_node = list.newNode(70);
		        list.sortedInsert(new_node);
		        
		        System.out.println("Sorted Linked List");
		        list.display();
	 }	
}
