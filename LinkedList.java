package com.bridgelabz.problemday13;
public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * uc1
	 * @param data
	 */
	public void insert(T data) {
		Node<T> newnode = new Node<T>(data);
		if (head == null && tail == null) {
			head = newnode;
			tail = newnode;
		} else {
			newnode.setNext(head);
			head = newnode;
		}
	}
	public void show() {
		Node<T> node = head;
		while (node != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
	}
}