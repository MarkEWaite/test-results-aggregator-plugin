package com.jenkins.testresultsaggregator.data;

import java.io.Serializable;
import java.net.URL;

public class PreviousBuildInfo implements Serializable {
	
	private static final long serialVersionUID = 3491188823666L;
	private int number;
	private URL url;
	
	public PreviousBuildInfo() {
		
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public URL getUrl() {
		return url;
	}
	
	public void setUrl(URL url) {
		this.url = url;
	}
}
