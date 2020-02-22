package com.cp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Excercise1 {

	@org.junit.Test
	public void test()
	{
		assertEquals(5, Exercise1.getSecondElement(new int[] {7,6,3,4}));
	}
}
