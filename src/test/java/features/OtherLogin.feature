@Other_LoginFeature @Login_Test_Regression
Feature: Other Login Functionality Validation

  @Other_Login1
  Scenario Outline: User should be able to login with valid credentials
    When User enters username as "<username>"
    When User enters password as "<password>"
    When User clicks signin button
    Then User should land on dashboard page

    Examples: 
      | username           | password |
      | demo@techfios.com  | abc1234  |
      | demo2@techfios.com | abc123   |
      | demo2@techfios.com | abc1234  |
      | demo@techfios.com  | abc123   |
