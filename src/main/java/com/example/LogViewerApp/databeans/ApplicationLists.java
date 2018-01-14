package com.example.LogViewerApp.databeans;

public class ApplicationLists
{

	private String appName = null;
	
	private String nasLogPathUrl = null;
	
	private String wasLogPathUrl = null;
	
	public ApplicationLists(String applicationName, String nasPath, String wasPath)
	{
		this.setAppName(applicationName);
		this.setNasLogPathUrl(nasPath);
		this.setWasLogPathUrl(wasPath);
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getNasLogPathUrl() {
		return nasLogPathUrl;
	}

	public void setNasLogPathUrl(String nasLogPathUrl) {
		this.nasLogPathUrl = nasLogPathUrl;
	}

	public String getWasLogPathUrl() {
		return wasLogPathUrl;
	}

	public void setWasLogPathUrl(String wasLogPathUrl) {
		this.wasLogPathUrl = wasLogPathUrl;
	}
	
}
