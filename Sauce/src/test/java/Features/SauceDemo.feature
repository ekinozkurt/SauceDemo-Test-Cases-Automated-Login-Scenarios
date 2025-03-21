@SauceDemo
  Feature: SauceDemo ile Test Case Kontrol

    @AllEmpty
    Scenario Outline: Empty Username and Password
      Given User at login page
      When Click login button wout fulfilling username and password
      Then Check "<error>" message about username
      Examples:
      |error                    |
      |Username is required     |

    @EmptyPassword
    Scenario Outline: Empty Password
      Given User at login page
      When Write "<username>" for username field
      When Click login button wout fulfilling username and password
      Then Check "<error>" message about password
      Examples:
      |username      |error               |
      |ekobaba       |Password is required|

    @EmptyUsername
    Scenario Outline: Empty Username
      Given User at login page
      When Write "<password>" for password field
      When Click login button wout fulfilling username and password
      Then Check "<error>" message about username
      Examples:
      |password   |error               |
      |123        |Username is required|

    @FalsePassword
    Scenario Outline: Correct Username and False Password
      Given User at login page
      When Write Correct "<username>" for username field
      When Write False "<password>" for password field
      When Click login button wout fulfilling username and password
      Then Check "<error>" message about missmatch
      Examples:
      |username       |error                                                      |password|
      |standard_user  |Username and password do not match any user in this service|1234    |

    @FalseUsername
    Scenario Outline: False Username and Correct Password
      Given User at login page
      When Write False "<username>" for username field
      When Write Correct "<password>" for password field
      When Click login button wout fulfilling username and password
      Then Check "<error>" message about missmatch
      Examples:
      |username     |error                                                      |password|
      |ekobaba      |Username and password do not match any user in this service|secret_sauce|

    @Correct
    Scenario Outline: Correct Username and Correct Password
      Given User at login page
      When Write Correct "<username>" for username field
      When Write Correct "<password>" for password field
      When Click login button wout fulfilling username and password
      Then Check successful login
      Examples:
      |username|password|
      |standard_user|secret_sauce|




