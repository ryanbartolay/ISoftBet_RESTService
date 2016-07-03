package com.isoftbet.test.util;

public class CommonUtilsTest {

	//A valid JSON String to parse.
	public static String validJsonString = "{ \"developers\": [{ \"firstName\":\"Linus\" , \"lastName\":\"Torvalds\" }, " +
	        "{ \"firstName\":\"John\" , \"lastName\":\"von Neumann\" } ]}";
	
	// Invalid String with a missing parenthesis at the beginning.
	public static String invalidJsonString = "\"developers\": [ \"firstName\":\"Linus\" , \"lastName\":\"Torvalds\" }, " +
			        "{ \"firstName\":\"John\" , \"lastName\":\"von Neumann\" } ]}";
}
