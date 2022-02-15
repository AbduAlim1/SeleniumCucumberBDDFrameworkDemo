Feature: feature file Parallel demo 1

  Background: User should be able to buy Kindle using Hamburger menu
    Given user located on amazon homepage
    When user clicks on the Hamburger menu
    And user selects "Kindle" under Hamburger menu
    And user clicks "Kindle" under Kindle E-Reader
    And user clicks on the Buy Now button

  Scenario: user should be asked for email and mobile number after clicked on Buy now
    Then user should be re-directed to Sign-in page
    And verify the content text below on Sign-in page
      | E-mail address or mobile phone number |