package com.isoftbet.model;

public class Country {
	private int id;  
	private String countryName;   
	
	public Country() {
	}
	
	public Country(int i) {		
		this.id = i;  
	}
	
	public Country(int i, String countryName) {  
		super();  
		this.id = i;  
		this.countryName = countryName;  
	}  
	public int getId() {  
		return id;  
	}  
	public void setId(int id) {  
		this.id = id;  
	}  
	public String getCountryName() {  
		return countryName;  
	}  
	public void setCountryName(String countryName) {  
		this.countryName = countryName;  
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName + "]";
	}
}
