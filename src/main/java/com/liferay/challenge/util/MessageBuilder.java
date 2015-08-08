package com.liferay.challenge.util;

import java.util.ArrayList;

public class MessageBuilder {
		
	public static String build(String organizationName, ArrayList<Integer>divisibleValues) {
		int size = divisibleValues.size();
		StringBuffer messageBuffer = new StringBuffer(organizationName);
		if (size > 0) {
			messageBuffer.append(", divisible en grupos de ").append(divisibleValues.remove(0));
			size--;
			for (int i = 0; i < size; i++) {
				messageBuffer.append(" o de ").append(divisibleValues.get(i));
			}
		}
		return messageBuffer.toString();
	}
	
}
