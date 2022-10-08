package org.adactinpomc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sselectahotel {
	
	public static WebDriver driver;
	@FindBy(xpath = "//input[@id='hotel_name_0']//preceding::input[@name='radiobutton_0']")
private WebElement rclick;
	@FindBy(xpath = "//label[@class='reg_error']//preceding-sibling::input[@name='continue']")
private WebElement conti;
	public Sselectahotel(WebDriver driver2) {
		Sselectahotel.driver = driver2;
		PageFactory.initElements(driver2,this);
	}
	//public Sselectahotel(WebDriver driver) {
		//Sselectahotel.driver = driver;
	//}
	public WebElement getRclick() {
		return rclick;
	}
	public WebElement getConti() {
		return conti;
	}
}
