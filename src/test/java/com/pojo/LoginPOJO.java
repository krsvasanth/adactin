package com.pojo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.UtilClass;

public class LoginPOJO extends UtilClass {
	
	public LoginPOJO() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtUser;

	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	@FindBy(id="location")
	private WebElement locationHotel;
	
	@FindBy(id="hotels")
	private WebElement hotelName;

	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(name="Submit")
	private WebElement searchBtn;
	
	@FindBy(name="radiobutton_0")
	private WebElement radioBtn;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;

	@FindBy(name="cc_num")
	private WebElement ccNum;
	
	@FindBy(name="cc_type")
	private WebElement ccType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement ccCvv;
	
	@FindBy(id="book_now")
	private WebElement booknowBtn;
	
	@FindBy(id="order_no")
	private WebElement orderNo;

	@FindBy(xpath="//div[@class='auth_error']")
	private WebElement errorMsg;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getLocationHotel() {
		return locationHotel;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCcCvv() {
		return ccCvv;
	}

	public WebElement getBooknowBtn() {
		return booknowBtn;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}
}

