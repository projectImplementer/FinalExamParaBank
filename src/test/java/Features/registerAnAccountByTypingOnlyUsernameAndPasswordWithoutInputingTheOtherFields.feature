Feature: Interact with RegForm
  Register by using only username, password and repeat password fields.

  Scenario: Create an account using only username, password and repeat password fields.
    When On Register page
    Then If Register form is displayed - Input All The Needed Credentials using only username, password and repeat password fields.