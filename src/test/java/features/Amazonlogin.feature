Feature: Amazon User Login

Scenario: User is trying to login with wrong credentials

Given user is already on login page
When title of the page is "Amazon Sign In"
Then user enters wrong username "hbfjwehfbehf"
Then user click on continue button
Then user gets an error for username "Wrong or invalid e-mail address or mobile phone number. Please correct it and try again."
Then user quit

Scenario: User is browsing on homepage
Given user is on home page
When title of the homepage is "Amazon.ca: Low Prices – Fast Shipping – Millions of Items"
Then user click on Best Seller link
Then best seller page opens
Then user click on homebutton
Then user comes back to homepage
Then user quit

