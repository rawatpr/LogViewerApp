package com.example.LogViewerApp.config;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/config/AppConfig.properties")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class AppConfig {

	@Autowired
	Environment env = null;

	private Map<String, String> config = null;

	public String getValue(String propertyKey) {
		System.out.println(this.env.getProperty(propertyKey));
		return this.env.getProperty(propertyKey);
	}

	public Map<String, String> getConfig() {
		return config;
	}

	public void setConfig(Map<String, String> config) {
		this.config = config;
	}

}
