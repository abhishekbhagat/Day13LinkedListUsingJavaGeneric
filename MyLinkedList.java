package com.bridgelabz.problemday13;

public class MyLinkedList {
	public static <T> void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Integer a = 70,b=30,c = 56;
		linkedList.append(a);
		linkedList.append(c);
		linkedList.insertNumberAfterGivenNumber(b,c);
		linkedList.show();
	}
}
