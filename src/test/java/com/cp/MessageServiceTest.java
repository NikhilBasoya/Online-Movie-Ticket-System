package com.cp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MessageServiceTest {

	@Test
	public void test()
	{
		assertEquals("Helo",MessageService.showMessage());
	}
}
