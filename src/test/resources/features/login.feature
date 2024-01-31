Feature: Product Feature
  bu test product kontrol ozelligini test eder

  @login
  Scenario: Product page login - product add
    Given User is on login product page
    When User enters valid username
    When User enters valid password
    When User login click
    When User clicks shoping card button
    When User clicks chekout button
    When User clicks continue button
    Then User should successfully item total valid the system








 