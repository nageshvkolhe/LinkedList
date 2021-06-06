package com.linkedlist;

public class LinkedList {
		public  Node head = null;
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

		void insertMid(int data) {
			if (head == null)
				head = new Node(data);
			else {
				Node newNode = new Node (data);
				Node newhead = head;
				int len = 0;
				while (newhead != null) {
					len++;
					newhead =newhead.next;
				}
				int count = ((len % 2) == 0) ? (len / 2) :
					(len + 1) / 2;
				newhead = head;

				while (count > 1)
					newhead = newhead.next;

				newNode.next = newhead.next;
				newhead.next = newNode;
			}
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

		public void main(String[] args) {
			LinkedList list = new LinkedList();

			list.addNode(56);
			list.addNode(70);

			list.display();

			System.out.println("After inset data in mid");
			list.insertMid(30);
			list.display();
		}
	}
}	
