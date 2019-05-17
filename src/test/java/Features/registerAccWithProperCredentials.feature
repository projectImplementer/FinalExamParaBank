Feature: Interact with RegisterForm
  Register Account with proper credentials

  Scenario: Input proper credentials
    When On register Page
    Given Register form is displayed - Input All The Needed Credentials
    Then Log Out
