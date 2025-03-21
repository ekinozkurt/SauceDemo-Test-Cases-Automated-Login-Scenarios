SauceDemo Login Test Automation

📌 Project Description

This repository contains automated test cases for the login functionality of SauceDemo. The tests are written in Cucumber (Gherkin) and are designed to validate different login scenarios, including incorrect credentials and missing fields.

🛠️ Technologies Used

Cucumber (Gherkin) for writing test cases

Selenium WebDriver for browser automation

Java

TestNG for test execution

📂 Test Scenarios

The test cases cover the following scenarios:

✅ Valid Login

Correct Username & Correct Password → Successful login

❌ Invalid Logins

Empty Username & Empty Password → Error: Username is required

Empty Password → Error: Password is required

Empty Username → Error: Username is required

Correct Username & Incorrect Password → Error: Username and password do not match any user in this service

Incorrect Username & Correct Password → Error: Username and password do not match any user in this service
