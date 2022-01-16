@Registration
Feature: Filling student registration form 

  @positive
  Scenario: Filling the form for Student Registration
    Given user enters the regsitration page
    When user fills all the mandatory fields
    And click on submit field
    Then user registration for student should be successfull  

 