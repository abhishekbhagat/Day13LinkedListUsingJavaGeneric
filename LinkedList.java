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
	 * 
	 * @param data
	 */
	public void insert(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	/**
	 * uc2
	 * 
	 * @param data
	 */
	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	/**
	 * uc3
	 * 
	 * @param data
	 */
	public void append(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
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