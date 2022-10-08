package org.Adtinrunner;

import org.Adatinn_utilityfiles.Utility_BC;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\Feature",
glue = "org.Step_Definiton",monochrome = true,
plugin={"pretty","html:Reports/adactin_test_report.html","json:Reports/Adactin_rept1.json"})
			

public class Cadacinrunner {
	public static WebDriver driver;
	
	@BeforeClass
	public  static void set_up()
	{
		driver=Utility_BC.get_Browser("chrome");
	}
	@AfterClass
	public static void tear_Down()
	{
	driver.quit();	
	}

}
