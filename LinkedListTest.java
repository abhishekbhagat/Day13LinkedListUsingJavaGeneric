package com.bridgelabz.problemday13;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void givenLinkedListWhenFindNodeOfGivenValue_ShouldReturnTrue() {
		SortedLinkedList<Integer> linkedList = new SortedLinkedList<Integer>();
		Integer a = 56, b = 30, c = 70;
		linkedList.append(a);
		linkedList.append(c);
		linkedList.insertNumberAfterGivenNumber(b, a);
		Assert.assertEquals(true,linkedList.findNodeWithValue(b));
	}
	@Test
	public void givenLinkedListToInsertANumberAfterGivenValue_ShouldPassLinkedResult() {
		SortedLinkedList<Integer> linkedList = new SortedLinkedList<Integer>();
		Integer a = 56, b = 30, c = 70;
		linkedList.append(a);
		linkedList.append(c);
		linkedList.insertNumberAfterGivenNodeKey(b, a);
		Assert.assertEquals(true,linkedList.findNodeWithValue(b));
	}
	@Test
	public void givenLinkedListDeleteGivenNode_ShouldPassLinkedResult() {
		SortedLinkedList<Integer> linkedList = new SortedLinkedList<Integer>();
		Integer a = 56, b = 30, c = 70;
		linkedList.append(a);
		linkedList.append(c);
		linkedList.insertNumberAfterGivenNodeKey(b, a);
		linkedList.deleteSelectedNode(b);
		Assert.assertEquals(false,linkedList.findNodeWithValue(b));
	}
}
