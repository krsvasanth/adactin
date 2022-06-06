package com.stepdefinition;

import com.base.UtilClass;
import com.pojo.LoginPOJO;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends UtilClass {
	
	LoginPOJO lp;
	
	@Given("User Launch Adactin Web Application")
	public void user_Launch_Adactin_Web_Application() {
		

	}
	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		lp=new LoginPOJO();
		type(lp.getTxtUser(), username);
		type(lp.getTxtPass(), password);
	}

	@When("User clicks Login button")
	public void user_clicks_Login_button() {
		lp=new LoginPOJO();
		btnClick(lp.getBtnLogin());
	}

	@Then("User verify Search Hotel page is displayed")
	public void user_verify_Search_Hotel_page_is_displayed() {
		boolean verSearchhotel = getPageUrl().contains("SearchHotel");
		System.out.println("Search Hotel Page is Displayed:");
	    System.out.println(verSearchhotel);
	}

	@When("User Selects valid {string},{string} and {string}")
	public void user_Selects_valid(String location, String hotel, String roomType) {
		selectbyVisibletext(lp.getLocationHotel(), location);
		selectbyVisibletext(lp.getHotelName(), hotel);
		selectbyVisibletext(lp.getRoomType(), roomType);
		
	}

	@When("User clicks search button")
	public void user_clicks_search_button() {
	   btnClick(lp.getSearchBtn());
	}

	@Then("User verify Select Hotel page is displayed")
	public void user_verify_Select_Hotel_page_is_displayed() {
	   boolean verSelecthotel = getPageUrl().contains("SelectHotel");
	   System.out.println("Select Hotel Page is Displayed");
	   System.out.println(verSelecthotel);
	}

	@When("User clicks radio button and clicks continue button")
	public void user_clicks_radio_button_and_clicks_continue_button() {
		lp=new LoginPOJO();
		btnClick(lp.getRadioBtn());
		btnClick(lp.getContinueBtn());
	}
	
	@Then("User verify Book a Hotel page is displayed")
	public void user_verify_Book_a_Hotel_page_is_displayed() {
	    boolean verBookHotel = getPageUrl().contains("BookHotel");
	    System.out.println("Verify Book Hotel Page is Displayed");
	    System.out.println(verBookHotel);
	}

	@When("User enters valid {string},{string} and {string}")
	public void user_enters_valid_and(String firstName, String lastName, String billingAddress) {
		type(lp.getFirstName(), firstName);
		type(lp.getLastName(), lastName);
		type(lp.getAddress(), billingAddress);
	}

	@When("User enters valid {string},{string},{string},{string} and {string}")
	public void user_enters_valid_and(String cardNumber, String cardType, String expMonth, String expYear, String cvv) {
		type(lp.getCcNum(), cardNumber);
		selectbyVisibletext(lp.getCcType(), cardType);
	    selectbyVisibletext(lp.getExpMonth(), expMonth);
	    selectbyVisibletext(lp.getExpYear(), expYear);
	    type(lp.getCcCvv(), cvv);
	}

	@When("USer clicks Book now button")
	public void user_clicks_Book_now_button() {
		btnClick(lp.getBooknowBtn());
	}

	
	@Then("User verify Adactin Login Page is Displayed")
	public void user_verify_Adactin_Login_Page_is_Displayed() {
		boolean lpDisp = getPageUrl().contains("adactin");
		System.out.println("Login Page Displayed:");
	    System.out.println(lpDisp);
	}

	@When("User enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
		lp=new LoginPOJO();
	    type(lp.getTxtUser(), "vasanth");
	    type(lp.getTxtPass(), "32435435643");
	}

	@Then("User verify Error message is Displayed")
	public void user_verify_Error_message_is_Displayed() {
		lp=new LoginPOJO();
		String err = getText(lp.getErrorMsg());
		System.out.println(err);
		
	}



}
