package com.bridgelabz.problemday13;

public class MyLinkedList {
	public static <T> void main(String[] args) {
		SortedLinkedList<Integer> linkedList = new SortedLinkedList<Integer>();
		Integer a = 56, b = 30, c = 70;
		linkedList.add(a);
		linkedList.add(c);
		linkedList.add(b);
		linkedList.show();
	}
}
