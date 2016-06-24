package com.isoftbet.test.model;

import org.junit.Test;

/**
 * Template to create a junit test cases for http endpoint 
 * @author ryan.bartolay
 */
public interface RESTWebserviceTest {
	@Test
	void testRetrieveAll();
	
	@Test
	void testRetrieveSuccess();
	
	@Test
	void testRetrieveFail();
	
	@Test
	void testCreateSuccess();
	
	@Test
	void testCreateFail();
	
	@Test
	void testUpdateSuccess();
	
	@Test
	void testUpdateFail();
	
	@Test
	void testDeleteSuccess();
	
	@Test
	void testDeleteFail();
}
