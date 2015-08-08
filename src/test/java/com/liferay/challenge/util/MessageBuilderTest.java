package com.liferay.challenge.util;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MessageBuilderTest {

	@Test
	public void testNoDivisibleValues() {
		String organizationName = "Liferay Inc.";

		ArrayList<Integer> divisibleValues = new ArrayList<Integer>();

		String message = MessageBuilder.build(organizationName, divisibleValues);
		
		assertTrue(message.equals(organizationName));
	}

	@Test
	public void testOneDivisibleValues() {
		String organizationName = "Liferay Inc.";

		ArrayList<Integer> divisibleValues = new ArrayList<Integer>();
		divisibleValues.add(3);

		String message = MessageBuilder.build(organizationName, divisibleValues);
		
		assertTrue(message.equals("Liferay Inc., divisible en grupos de 3"));
	}

	@Test
	public void testMoreThanOneDivisibleValues() {
		String organizationName = "Liferay Inc.";

		ArrayList<Integer> divisibleValues = new ArrayList<Integer>();
		divisibleValues.add(3);
		divisibleValues.add(5);

		String message = MessageBuilder.build(organizationName, divisibleValues);
		
		assertTrue(message.equals("Liferay Inc., divisible en grupos de 3 o de 5"));
	}
	
}
