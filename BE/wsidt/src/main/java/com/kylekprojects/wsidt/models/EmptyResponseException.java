package com.kylekprojects.wsidt.models;

public class EmptyResponseException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String url;
	private String message;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public EmptyResponseException(String url, String message) {
		super(message);
		this.url = url;
		this.message = message;
	}
	
}
