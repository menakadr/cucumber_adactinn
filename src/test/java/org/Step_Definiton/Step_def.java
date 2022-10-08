package org.Step_Definiton;

import org.Adatinn_utilityfiles.Utility_BC;
import org.Adtinrunner.Cadacinrunner;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Step_def extends Utility_BC{
	public static WebDriver driver=Cadacinrunner.driver;
	public static org.Obj.m.SprojectobjectMannager manager=new org.Obj.m.SprojectobjectMannager(driver);
	
	@Given("^user launch the Application$")
	public void user_launch_the_Application() throws Throwable {
	   get_u("https://adactinhotelapp.com/");
	}

	@When("^User Enter the username in username field$")
	public void user_Enter_the_username_in_username_field() throws Throwable {
	    sendkeys(manager.getAp().getUsername(),"menakacse");
	}

	@When("^User Enter the Password in Password field$")
	public void user_Enter_the_Password_in_Password_field() throws Throwable {
		Thread.sleep(3000);
		sendkeys(manager.getAp().getPassword(),"menakacse"); 
	 
	}

	@Then("^user click on login button and it navigates to Search Hotel page$")
	public void user_click_on_login_button_and_it_navigates_to_Search_Hotel_page() throws Throwable {
    click_webelement(manager.getAp().getLogin());
	}
    
	@When("user select the hotel Location")
	public void user_select_the_hotel_location() throws Throwable {
		Thread.sleep(2000);
		selectMethod("svalue",manager.getAs().getLocation(), "London", 0); 
	}
	@When("user select the hotels")
	public void user_select_the_hotels() {
	
	   selectMethod("svisibletext",manager.getAs().getHotels(),"Hotel Sunshine", 0);
	}
	@When("user select the hotel Roomtype")
	public void user_select_the_hotel_roomtype() {
		selectMethod("sindex",manager.getAs().getRoom_type(), null, 1);
	}
	@When("user select the NumberofRooms")
	public void user_select_the_numberof_rooms() {
		selectMethod("svisibletext",manager.getAs().getNrooms(),"3 - Three", 0);  
	}
	@When("user provide the Check_in_date")
	public void user_provide_the_check_in_date() {
		clear_webelement(manager.getAs().getDate_in());
		sendkeys(manager.getAs().getDate_in(),"29/8/2022");  
	}
	@When("user provide the Check_out_date")
	public void user_provide_the_check_out_date() {
		clear_webelement(manager.getAs().getDateout());
		sendkeys(manager.getAs().getDateout(),"30/8/2022");
	}
	@When("user select the Adults_per room")
	public void user_select_the_adults_per_room() {
		select_Dropdownvisibletext(manager.getAs().getAdult(),"4 - Four");
	}
	@When("user select the Children_per room")
	public void user_select_the_children_per_room() {
		select_Dropdownvalue(manager.getAs().getChild(),"2");
	}
	@Then("user click on Search Button and it navigates to Select Hotel page")
	public void user_click_on_search_button_and_it_navigates_to_select_hotel_page() throws Throwable {
		  Thread.sleep(5000);
		  click_webelement(manager.getAs().getSearch()); 
	}
	@When("user click on select hotel radio button")
	public void user_click_on_select_hotel_radio_button() throws Throwable {
		Thread.sleep(4000);
	     click_webelement(manager.getSh().getRclick());	
	}
	@Then("user click on continue button")
	public void user_click_on_continue_button() {
		click_webelement(manager.getSh().getConti());
	}
    
	@When("user provide first name")
	public void user_provide_first_name() {
	   sendkeys(manager.getPm().getFirstname(),"menaka");
	}
	@When("user provide last name")
	public void user_provide_last_name() {
	    sendkeys(manager.getPm().getLastname(),"r");
	}
	@When("user provide billing address")
	public void user_provide_billing_address() {
	sendkeys(manager.getPm().getAddress(),"bangalore");
	}
	@When("user provide credit card number")
	public void user_provide_credit_card_number() {
	  sendkeys(manager.getPm().getCreditcard(),"12345677890127896");  
	}
	@When("user provide credit card type")
	public void user_provide_credit_card_type() {
		select_Dropdownvalue(manager.getPm().getCreditcardtype(),"VISA");
	}
	@When("user provide creditcard expiry month")
	public void user_provide_creditcard_expiry_month() {
		select_Dropdownvisibletext(manager.getPm().getEmonth(),"February");  
	}
	@When("user provide creditcard expiry year")
	public void user_provide_creditcard_expiry_year() {
		select_Dropdownvisibletext(manager.getPm().getEyear(),"2022");
	}
	@When("user provide credit card cvv number")
	public void user_provide_credit_card_cvv_number() {
		sendkeys(manager.getPm().getCvv(),"345");
	}
	@Then("user click on book now button then it navigates to Hotel Booking Confirmation")
	public void user_click_on_book_now_button_then_it_navigates_to_hotel_booking_confirmation() {
		click_webelement(manager.getPm().getBooknow());  
	}

	@Then("user click on logout  button")
	public void user_click_on_logout_button() {
	   System.out.println("logout sucessfull");
	}
	
	
	
	

	

}
