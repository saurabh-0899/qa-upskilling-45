Feature: To Validate Flipkart Application

Background:

Given Launch the Flipkart Application
When close the popup
Then Return to Main Screen

Scenario:search functionality
Given Enter the text in search field
When Click the Search Button
Then It should navigate to the search result page and display the relevant details