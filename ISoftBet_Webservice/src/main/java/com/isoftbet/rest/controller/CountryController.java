package com.isoftbet.rest.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.isoftbet.model.Country;
import com.isoftbet.rest.model.RestResponse;
import com.isoftbet.service.CountryServiceImpl;

@RestController
public class CountryController {  
	private CountryServiceImpl countryService;
	
	public CountryServiceImpl getCountryService() {
		return countryService;
	}

	public void setCountryService(CountryServiceImpl countryService) {
		this.countryService = countryService;
	}

	@RequestMapping(value = "/countries", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Country>> getCountries() {
		List<Country> countries = countryService.retrieveAll();
		
		if(countries == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(countries, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)  
	public ResponseEntity<Country> getCountryById(@PathVariable long id) {  
		Country country = countryService.retrieve(id);
		if(country == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(country, HttpStatus.OK);  
	}  

	@RequestMapping(value = "/countries", method = RequestMethod.POST)  
	public ResponseEntity<Void> createCountry(@RequestBody Country country, UriComponentsBuilder ucBuilder) {  
		if (countryService.retrieve(country) != null) {           
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
		
		countryService.create(country);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/countries/{id}").buildAndExpand(country.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/countries", method = RequestMethod.PUT) 
	public ResponseEntity<Country> updateCountry(@PathVariable("id") long id, @RequestBody Country country) {
		Country search = countryService.retrieve(id);
		
		if(search == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		country.setId(search.getId());
		countryService.update(country);
		
		return new ResponseEntity<>(country, HttpStatus.OK);
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.DELETE)  
	public ResponseEntity<RestResponse> deleteCountry(@PathVariable("id") long id) {
		
		Country search = countryService.retrieve(id);
		
		if(search == null) {
			return new ResponseEntity<RestResponse>(HttpStatus.NOT_FOUND);
		}
		
		countryService.delete(search);
		return new ResponseEntity<RestResponse>(HttpStatus.OK);
	}
}  