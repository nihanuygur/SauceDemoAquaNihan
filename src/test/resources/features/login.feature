Feature: Login page with Aqua

  @wip
  Scenario: Positive login test
    Given The user is on the login page
    When The user enters with "standard_user" and "secret_sauce" and clicks login button
    Then The user should be able to login successfully
