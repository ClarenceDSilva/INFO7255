package com.example.domain;

public class RedisResult {

	private String key;
	private String value;

	public RedisResult() {
		
	}
	public RedisResult(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}