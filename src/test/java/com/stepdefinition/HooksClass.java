package com.stepdefinition;

import com.base.UtilClass;

import io.cucumber.java.Before;

public class HooksClass extends UtilClass {
	@Before
	public void beforeExecution() {
		launchBrowser();
		maxiWindow();
		launchUrl("https://adactinhotelapp.com/HotelAppBuild2/");
	}

	public void afterExecution() {

		closeAll();
	}
}
