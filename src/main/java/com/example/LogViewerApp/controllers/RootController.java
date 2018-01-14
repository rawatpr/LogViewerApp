package com.example.LogViewerApp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.LogViewerApp.databeans.ApplicationLists;

@RestController
@RequestMapping("/applications")
public class RootController {

	public List<ApplicationLists> applicationInfo = null;

	public RootController() {
		applicationInfo = new ArrayList<>();
		applicationInfo.add(new ApplicationLists("SelectIVR", "/usr/local/nglogs/SelectIVR/logs",
				"/usr/logs/was85/SelectIVR/logs"));
		applicationInfo
				.add(new ApplicationLists("RCEIVR", "/usr/local/nglogs/RCEIVR/logs", "/usr/logs/was85/RCEIVR/logs"));
		applicationInfo.add(new ApplicationLists("ETSIVRWebSerfvice", "/usr/local/nglogs/ETSIVRWebSerfvice/logs",
				"/usr/logs/was85/ETSIVRWebSerfvice/logs"));
	}

	@RequestMapping(value = "/appLogPaths", method = RequestMethod.GET)
	public List<ApplicationLists> getAppInfo() {
		return this.applicationInfo;
	}
}
