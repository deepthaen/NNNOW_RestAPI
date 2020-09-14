Feature: Login Functionality

Scenario Outline: Login to HDFC Bank Application
Given User launch Browser
When User enter URL
When User Enter Username "<username>" 
Then User Click on Contionue
When User Password "<password>"
Then user click on Login

Examples: 
        | username | password |
        |9986519557|nnnow123  |