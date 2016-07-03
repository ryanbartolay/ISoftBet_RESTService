package com.isoftbet.test.util;

import org.junit.Test;

import com.isoftbet.util.AuthUtils;

import junit.framework.TestCase;

public class AuthUtilsTest extends TestCase {

	@Test
	public void testHashSuccess() {
		assertNotNull(AuthUtils.getHash(CommonUtilsTest.validJsonString));
	}
	
	@Test
	public void testHashFailed() {	
		assertNull(AuthUtils.getHash(CommonUtilsTest.invalidJsonString));
	}
}
