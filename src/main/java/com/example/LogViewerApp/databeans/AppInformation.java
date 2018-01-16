package com.example.LogViewerApp.databeans;

public class AppInformation {

	private String appName = null;

	private String defaultPage = null;

	private String nasLogPathUrl = null;

	private String wasLogPathUrl = null;
	
	private String serverName = null;

	/**
	 * @return the serverName
	 */
	public String getServerName() {
		return serverName;
	}

	/**
	 * @param serverName the serverName to set
	 */
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	/**
	 * @return the defaultPage
	 */
	public String getDefaultPage() {
		return defaultPage;
	}

	/**
	 * @param defaultPage
	 *            the defaultPage to set
	 */
	public void setDefaultPage(String defaultPage) {
		this.defaultPage = defaultPage;
	}

	public AppInformation(String applicationName, String nasPath, String wasPath) {
		this.setAppName(applicationName);
		this.setNasLogPathUrl(nasPath);
		this.setWasLogPathUrl(wasPath);
	}

	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * @param appName
	 *            the appName to set
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * @return the nasLogPathUrl
	 */
	public String getNasLogPathUrl() {
		return nasLogPathUrl;
	}

	/**
	 * @param nasLogPathUrl
	 *            the nasLogPathUrl to set
	 */
	public void setNasLogPathUrl(String nasLogPathUrl) {
		this.nasLogPathUrl = nasLogPathUrl;
	}

	/**
	 * @return the wasLogPathUrl
	 */
	public String getWasLogPathUrl() {
		return wasLogPathUrl;
	}

	/**
	 * @param wasLogPathUrl
	 *            the wasLogPathUrl to set
	 */
	public void setWasLogPathUrl(String wasLogPathUrl) {
		this.wasLogPathUrl = wasLogPathUrl;
	}

}
