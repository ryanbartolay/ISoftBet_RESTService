package com.isoftbet.rest.model;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class ErrorResponse implements Response {
	
	private ResourceBundle labels = PropertyResourceBundle.getBundle("conf.locale.LabelsBundle");
	
	public ResourceBundle getLabels() {
		return labels;
	}
	public void setLabels(ResourceBundle labels) {
		this.labels = labels;
	}
}
