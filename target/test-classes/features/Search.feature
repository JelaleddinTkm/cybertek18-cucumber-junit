Feature: Search
  Agile Story: As a user, I should be able to search when I am on Google search page.


  Background: User should be on the google search page
    Given User is on the google search page

  Scenario: Google default title verification
    Then User should see title is Google



  Scenario: Google default title verification
    When User searches apple
    Then User should see apple in the title


  Scenario: Google default title verification
    When User searches "peach"
    Then User should see "peach" in the title


  @wip    #work in progress
  Scenario: Google -About- link page title verification
    Then User should see About link
    And User clicks to About link
    Then User should see title Google - About Google, Our Culture & Company News

      #MAC: OPTION + ENTER --> ALLOWS YOU TO GENERATE STEP DEFINITIONS


