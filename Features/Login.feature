Feature: Test Login
Description : Test logina and password

Scenario: Login with valid username and password
Given Open the Browser
When Enter the URL "http://practice.automationtesting.com/"
And Click on Account Menu
And Enter registered username and password
And Click on login button
Then user must login successfully
