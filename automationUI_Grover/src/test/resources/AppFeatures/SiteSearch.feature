Feature: Searching the Grover website displays relevant results

  Scenario:Searching within the menu bar
    When I search Product HP
    Then the Appropriate search should contain the search input
    When I click on Cart Button
    And I Enter Sign_up Details
    Then Mobile confirmation should display  
    # When Enter valid OTP
    #Then Verify search product added to Cart SucessFully 
   
    
                                                           |
