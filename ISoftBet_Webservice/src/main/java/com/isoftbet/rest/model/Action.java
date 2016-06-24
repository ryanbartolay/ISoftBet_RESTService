package com.isoftbet.rest.model;

import java.util.Map;

public class Action {
	private String command;
	private Map<String, String> parameters;
	
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public Map<String, String> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
	@Override
	public String toString() {
		return "Action [command=" + command + "]";
	}
}
