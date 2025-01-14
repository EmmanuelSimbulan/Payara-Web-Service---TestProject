package com.svi.testproject.enums;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public enum Config {
	PLAYER_TEXT_FILE("PLAYER_TEXT_FILE"),
	SAMPLE_CONFIG("SAMPLE_CONFIG");
	
	private String value = "";
	private static Properties properties;
	
	private Config(String value) {
		this.value = value;
	}
	
	public String value() {
		String systemEnv = System.getenv(value);
		if(systemEnv != null) 
			return systemEnv.trim();
		return properties.getProperty(value).trim();
	}
	
	public static void setContext(InputStream inputStream) {
		if (inputStream != null) {
			try {
				properties = new Properties();
				properties.load(inputStream);
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
				try {
					inputStream.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
