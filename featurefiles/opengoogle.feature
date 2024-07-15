
Feature: Google page Test

Scenario: Google url checking

Given user is entering google.co.in
When user is typing the searchterm as "java"
And enters the return key
Then it should be open perfectly


 