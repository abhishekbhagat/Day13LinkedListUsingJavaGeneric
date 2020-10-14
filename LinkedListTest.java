package com.bridgelabz.problemday13;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void givenLinkedListWhenFindNodeOfGivenValue_ShouldReturnTrue() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Integer a = 56, b = 30, c = 70;
		linkedList.append(a);
		linkedList.append(c);
		linkedList.insertNumberAfterGivenNumber(b, a);
		Assert.assertEquals(true,linkedList.findNodeWithValue(b));
	}

}
