package com.isoftbet.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
	@PropertySource(value="classpath:conf/datasource.properties", ignoreResourceNotFound=false),
	@PropertySource(value="classpath:db.properties", ignoreResourceNotFound=true)
})
public class AppConfig {
	
	@Autowired
	private Environment environment;
	
	
	@Value("${jdbc.driver}")
	private String jdbcDriver;
	
	@Value("${jdbc.url}")
	private String jdbcUrl;

	@Value("${jdbc.username}")
	private String jdbcUsername;
	
	@Value("${jdbc.password}")
	private String jdbcPassword;
	
	public String getValue(String key) {
		return environment.getProperty(key);
	}
	
	//To resolve ${} in @Value
	@Bean 
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
