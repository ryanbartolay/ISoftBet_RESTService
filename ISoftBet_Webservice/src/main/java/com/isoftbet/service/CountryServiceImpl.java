package com.isoftbet.service;

import java.util.ArrayList;
import java.util.List;

import com.isoftbet.crud.model.CRUDService;
import com.isoftbet.model.Country;

public class CountryServiceImpl implements CRUDService<Country> {

	@Override
	public List<Country> retrieveAll() {
		// TODO Auto-generated method stub
		List<Country> listOfCountries = new ArrayList<>();
		
		Country indiaCountry=new Country(1, "India");  
		Country chinaCountry=new Country(4, "China");  
		Country nepalCountry=new Country(3, "Nepal");  
		Country bhutanCountry=new Country(2, "Bhutan");
		listOfCountries .add(indiaCountry);  
		listOfCountries.add(chinaCountry);  
		listOfCountries.add(nepalCountry);  
		listOfCountries.add(bhutanCountry);  
		return listOfCountries;
	}

	@Override
	public Country retrieve(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country retrieve(Country t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Country t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Country t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Country t) {
		// TODO Auto-generated method stub
		
	}


}
