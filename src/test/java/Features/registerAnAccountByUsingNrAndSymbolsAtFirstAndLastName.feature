Feature: Interact with RegForm
  Register an account using symbols and numbers at first and last name

  Scenario: Create an account using symbols and numbers at first and last name
    When on RegisterPage
    Then If Register form is displayed - Input All The Needed Credentials using symbols and numbers at first and last name