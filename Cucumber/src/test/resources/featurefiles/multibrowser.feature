@allrun
Feature: multibrowser

@testmulti
Scenario:using multi browser
Given launch the browsers
When open url "https://demo.automationtesting.in/Register.html"
Then validate title
And close the brosers 