package org.adactinpomc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//adactin front home page class
public class AdactinPomclass {
	public static WebDriver driver;
	
@FindBy(xpath = "//input[@class='login_input']")
private WebElement username;

@FindBy(xpath = "//input[@id='password']")
private WebElement password;

@FindBy(xpath ="//input[@name='login']")
private WebElement login;


public AdactinPomclass(WebDriver driver) {
	AdactinPomclass.driver=driver;
	PageFactory.initElements(driver,this);
}

public WebElement getUsername() {
	return username;
}



public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

}

