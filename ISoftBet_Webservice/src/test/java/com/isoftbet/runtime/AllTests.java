package com.isoftbet.runtime;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.isoftbet.test.config.AppConfigTest;
import com.isoftbet.test.dao.PlayerDaoTest;

@RunWith(Suite.class)
@SuiteClasses({
	AppConfigTest.class, 
	//CountryControllerTest.class, 
	PlayerDaoTest.class})
public class AllTests {
	
}
