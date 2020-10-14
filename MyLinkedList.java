package com.bridgelabz.problemday13;

public class MyLinkedList {
	public static <T> void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Integer a = 56, b = 30, c = 70;
		linkedList.append(a);
		linkedList.append(c);
		linkedList.insertNumberAfterGivenNodeKey(b, a);
		linkedList.deleteSelectedNode(b);
		linkedList.show();
	}
}
