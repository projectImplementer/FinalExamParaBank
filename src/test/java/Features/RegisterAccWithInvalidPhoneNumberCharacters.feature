Feature: Interact with RegForm
  Register an account with invalid phone number

  Scenario: Create an account with invalid phone number
    When On Register Page
    Then If Register form is displayed - Input All The Needed Credentials including the invalid phone number