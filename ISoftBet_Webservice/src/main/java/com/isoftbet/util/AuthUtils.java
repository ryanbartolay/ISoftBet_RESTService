package com.isoftbet.util;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthUtils {
	private static final Logger logger = LoggerFactory.getLogger(AuthUtils.class);
	
	final protected static char[] hexArray = "0123456789abcdef".toCharArray();
	final protected static String secretKey = "verySecretKey";
	
	/**
	 * Hash implementation
	 * @param json_message
	 * @return ie. 514acab8e3ff3f6b7562e8b6ef44141d21e90d7aa19002a38314ecc9fbce2553
	 */
	public static String getHash(String json_message) {
		try {
		SecretKeySpec keySpec = new SecretKeySpec(secretKey.getBytes(), "HmacSHA256");
			Mac mac = Mac.getInstance("HmacSHA256");
			mac.init(keySpec);
			byte[] rawHmac = mac.doFinal(json_message.getBytes());
			return bytesToHex(rawHmac);
		} catch (NoSuchAlgorithmException | InvalidKeyException e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}
	
	private static String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}
}
