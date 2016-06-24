package com.isoftbet.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ISoftProperties {
	private File file;
	private Properties properties;
	
	public ISoftProperties(String path) {
		file = new File(path);
				
		try(FileInputStream fileInput = new FileInputStream(file);) {
			properties = new Properties();
			properties.load(fileInput);			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		String str = "" + file.getPath() + "\n"; 
		Enumeration<Object> enuKeys = properties.keys();
					
		while (enuKeys.hasMoreElements()) {
			String key = (String) enuKeys.nextElement();
			String value = properties.getProperty(key);
			str += key + ": " + value + "\n";
		}

		return str;
	}

	public String getValue(String key) {		
		return properties.getProperty(key);
	}
}
