package org.adactinpomc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactinsecondpage {
	public static WebDriver driver;
@FindBy(xpath ="//tr//child::select[@id='location']" )
private WebElement location;
@FindBy(xpath ="//td//child::select[@id='hotels']")
private WebElement hotels;
@FindBy(xpath ="//span[@id='room_type_span']//preceding-sibling::select[@id='room_type']")
private WebElement room_type;
@FindBy(xpath ="//td//child::select[@id='room_nos']" )
private WebElement nrooms;
@FindBy(xpath ="//span[@id='checkin_span']//preceding-sibling::input[@name='datepick_in']" )
private WebElement date_in;
@FindBy(xpath ="//span[@id='checkout_span']//preceding-sibling::input[@name='datepick_out']")
private WebElement dateout;
@FindBy(xpath = "//span[@class='reg_error']//following::select[@name='adult_room']")
private WebElement adult;
@FindBy(xpath = "//span[@id='child_room_span']//preceding-sibling::select[@name='child_room']")
private WebElement child;
@FindBy(xpath = "//input[@id='datepick_diff']//preceding-sibling::input[@name='Submit']")
private WebElement search;
public Adactinsecondpage(WebDriver driver2) {
	Adactinsecondpage.driver = driver2;
	PageFactory.initElements(driver2,this);
}
//public Adactinsecondpage(WebDriver driver) {
	//Adactinsecondpage.driver=driver;
	//PageFactory.initElements(driver, this);
//}
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoom_type() {
	return room_type;
}
public WebElement getNrooms() {
	return nrooms;
}
public WebElement getDate_in() {
	return date_in;
}
public WebElement getDateout() {
	return dateout;
}
public WebElement getAdult() {
	return adult;
}
public WebElement getChild() {
	return child;
}
public WebElement getSearch() {
	return search;
}



}
