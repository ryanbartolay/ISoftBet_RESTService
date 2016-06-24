package com.isoftbet.test.rest.controller;

import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import com.isoftbet.model.Country;
import com.isoftbet.test.model.RESTWebserviceTest;
import com.isoftbet.test.util.ISoftPropertiesTest;

import junit.framework.TestCase;

public class CountryControllerTest extends TestCase implements RESTWebserviceTest {

	private RestTemplate restTemplate;

	@Before
	public void setUp() throws Exception {
		restTemplate = new RestTemplate();
	}

	@Test
	public void testRetrieveAll() {
		List<Country> countries = restTemplate.getForObject(ISoftPropertiesTest.REST_SERVICE_URI + "/countries", List.class);
		assertFalse(countries instanceof List);
		assertNotNull(countries);
	}

	@Test
	public void testRetrieveSuccess() {
		RestTemplate restTemplate = new RestTemplate();
		Country country = restTemplate.getForObject(ISoftPropertiesTest.REST_SERVICE_URI + "/country/3", Country.class);		
		assertNotNull(country);
	}

	@Override
	public void testRetrieveFail() {
		Country country = restTemplate.getForObject(ISoftPropertiesTest.REST_SERVICE_URI + "/country/0", Country.class);
		assertNull(country);
	}

	@Override
	public void testCreateSuccess() {
		Country user = new Country(5, "Philippines");
		URI uri = restTemplate.postForLocation(ISoftPropertiesTest.REST_SERVICE_URI + "/user/", user, Country.class);
		System.out.println("Location : "+uri.toASCIIString());
		
	}

	@Override
	public void testCreateFail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testUpdateSuccess() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testUpdateFail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testDeleteSuccess() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testDeleteFail() {
		// TODO Auto-generated method stub
		
	}
}
