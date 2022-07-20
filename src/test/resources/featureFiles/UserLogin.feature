Feature: User Login

  Background:
    Given The Environment is set as "scalaPayTestEnv"
    And The application is launched in "Chrome"

  Scenario Outline: User login to scalaPay web portal and all page layout presented as expected
    Given <loginUsr> user login to scalaPay test env web portal
    Then user successfully landed on dashboard screen
    @test
    Examples:
      | loginUsr |
      | Michael  |
