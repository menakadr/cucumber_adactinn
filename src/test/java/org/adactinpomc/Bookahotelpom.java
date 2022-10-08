package org.adactinpomc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookahotelpom {
	public static WebDriver driver;
	@FindBy(xpath = "//span[@class='reg_error']//preceding::input[@name='first_name']")
private WebElement firstname;
	@FindBy(xpath = "//label[@class='reg_error']//preceding-sibling::input[@name='last_name']")
private WebElement lastname;
	@FindBy(xpath ="//label[@class='reg_error']//preceding-sibling::textarea[@name='address']" )
private WebElement address;
	@FindBy(xpath ="//label[@id='cc_num_span']//preceding-sibling::input[@name='cc_num']" )
private WebElement creditcard;
	@FindBy(xpath = "//label[@id='cc_type_span']//preceding-sibling::select[@name='cc_type']")
private WebElement 	creditcardtype;
	@FindBy(xpath = "//label[@id='cc_expiry_span']//preceding::select[@name='cc_exp_month']")
private WebElement emonth;
	@FindBy(xpath ="//label[@id='cc_expiry_span']//preceding-sibling::select[@name='cc_exp_year']")
private WebElement eyear;	
	@FindBy(xpath = "//label[@id='cc_cvv_span']//preceding-sibling::input[@name='cc_cvv']")
private WebElement cvv;
	@FindBy(xpath ="//input[@id='final_price_hid']//preceding-sibling::input[@name='book_now']" )
private WebElement booknow;
	
	
	
	public Bookahotelpom(WebDriver driver2) {
		Bookahotelpom.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditcard() {
		return creditcard;
	}
	public WebElement getCreditcardtype() {
		return creditcardtype;
	}
	public WebElement getEmonth() {
		return emonth;
	}
	public WebElement getEyear() {
		return eyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
}
	
	
	
