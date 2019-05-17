Feature: Interact with RegForm
  Register an account with a used username

  Scenario: Create an account with a used username
    When on Register Page
    Then If Register form is displayed - Input All The Needed Credentials using an already created username