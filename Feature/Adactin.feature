Feature: Hotel Booking In Adactin Application
Scenario: User Login Functionality
    Given user launch the Application
    When User Enter the username in username field
    And User Enter the Password in Password field
    Then user click on login button and it navigates to Search Hotel page
Scenario: User Select the Hotel
    When user select the hotel Location
    And user select the hotels 
    And user select the hotel Roomtype
    And user select the NumberofRooms
    And user provide the Check_in_date
    And user provide the Check_out_date
    And user select the Adults_per room
    And user select the Children_per room
    And user select the hotel Location
    Then user click on Search Button and it navigates to Select Hotel page
Scenario: User click on selected hotel
    When user click on select hotel radio button
    Then user click on continue button
Scenario: user Book the Hotel
    When user provide first name
    And user provide last name
    And user provide billing address 
    And user provide credit card number
    And user provide credit card type
    And user provide creditcard expiry month
    And user provide creditcard expiry year
    And user provide credit card cvv number
    Then user click on book now button then it navigates to Hotel Booking Confirmation
Scenario: usser click on Myitinerary
    Then user click on logout  button
