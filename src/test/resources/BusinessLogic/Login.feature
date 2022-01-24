Feature:Login Functionality
Background:User successfully login
Given user open "Chrome"browser with exe "D:\\software_Testing\\Automation_support\\chromedriver.exe"
Given user open url "https://www.flipkart.com/"

@SmokeTest
Scenario:Login Functionality with valid credential
When user click on cancle button
When user move on login dropdown
When user click on my profile
When user enter username as "9822741789"
When user enter password as "ganeshrutuja"
When user click on Login button
Then Application show user profile