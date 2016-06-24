package com.isoftbet.model;

public enum ErrorType {
	GENERAL("General"),
	REQUEST("Request"),
	INIT("Initialization"),
	BET("Bet"),
	WIN("Win"),
	CANCEL("Cancel"),
	DIALOG("Dialog");
	
	private String name;
	
	private ErrorType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
