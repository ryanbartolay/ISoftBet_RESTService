package com.isoftbet.util;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author RyanKristoffer
 * @since 01072016
 */
public class CommonUtils {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);
	
	// returns whether the given string is in valid format
	public static boolean isJSONValid(String jsonString ) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			mapper.readTree(jsonString);
			return true;
		} catch (IOException e) {
			logger.error(e.getMessage(),e);
			return false;
		}
	}

	// returns timestamp that is compatible with datatype timestamp
	public static final Timestamp getCurrentTimestamp() {
		return new Timestamp(getDateInMillis());
	}

	// returns date in milliseconds format
	public static final long getDateInMillis() {
		return new java.util.Date().getTime();
	}

	// essential for generating salt for session, testing unique identifiers
	// TODO : Owasp implementation of request salting
	public static final String generateAlphaNumericString() {
		return generateAlphaNumericString(10);
	}
	public static final String generateAlphaNumericString(int length) {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 18) {
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		return salt.toString();
	}

}
