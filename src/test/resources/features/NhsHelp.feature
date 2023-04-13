@wip
Feature:As a citizen of the UK
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need

  Background: This is given
    Given the user is on "Landing Page"


  @First
  Scenario: To verify the person from Northern Ireland will get NHS help
    When the user clicks on start button
    And the user is from Nothern Ireland
    Then the user will not get any kind of help

  @Second
  Scenario Outline: To Verify the person who is under sixteen will get NHS help
    When the user clicks on start button
    Then user navigates to "Which country do you live in" Page
    Then the user selects the "<Country>"
    Then user navigates to "Is your GP practice in Scotland or Wales?" Page
    And the user selects yes or no for GP practice in scotland or wales
    Then user navigates to "Which country is your dental practice in?" Page
    Then the user selects the "<Country>"
    Then user navigates to "What is your date of birth?" Page
    And the user is less than sixteen years of age "<day>" "<month>" "<year>"
    Then the user should get free NHS help
     Examples:
      | Country   | day | month | year |
      |England    |01  | 01  | 2019|
      |Wales    |01  | 01  | 2019|

  @Third
  Scenario Outline: To verify the person from UK and is over sixteen will get NHS help
    When the user clicks on start button
    Then user navigates to "Which country do you live in" Page
    Then the user selects the "<Country>"
    Then user navigates to "Is your GP practice in Scotland or Wales?" Page
    And the user selects yes or no for GP practice in scotland or wales
    Then user navigates to "Which country is your dental practice in?" Page
    Then the user selects the "<Country>"
    Then user navigates to "What is your date of birth?" Page
    And the user is less than sixteen years of age "<day>" "<month>" "<year>"
    Then user navigates to "Do you live with a partner?" Page
    And the user selects yes for Do you live with a partner
    Then user navigates to "Do you or your partner claim any benefits or tax credits?" Page
    And the user selects yes for Do you or your partner claim any benefits or tax credits
    Then user navigates to "Universal Credit" Page
    And the user selects yes we receive universal credit payments for Universal Credit Page
    Then user navigates to "joint Universal Credit" Page
    And the user selects yes for joint Universal Credit Page
    Then user navigates to "take-home pay of £935" Page
    And the user selects yes for take home pay Page
    Then the user will get free NHS help
    Examples:
      | Country | day | month | year |
      |England    |01  | 01  | 1991|

  @Fourth
  Scenario Outline: To verify the person from UK, Over 16 and not living with partner will get NHS help
    When the user clicks on start button
    Then user navigates to "Which country do you live in" Page
    Then the user selects the "<Country>"
    Then user navigates to "Is your GP practice in Scotland or Wales?" Page
    And the user selects yes or no for GP practice in scotland or wales
    Then user navigates to "Which country is your dental practice in?" Page
    Then the user selects the "<Country>"
    Then user navigates to "What is your date of birth?" Page
    And the user is less than sixteen years of age "<day>" "<month>" "<year>"
    Then user navigates to "Do you live with a partner?" Page
    And the user selects no for Do you live with a partner
    Then user navigates to "Do you claim any benefits or tax credits?" Page
    And the user selects no for Do you claim any benefits or tax credits
    Then user navigates to "Are you pregnant" Page
    And the user selects yes or no for Are you pregnant
    Then user navigates to "Do you have an injury  by serving in armed forces?" Page
    And the user selects yes or no for Do you have an injury  by serving in armed forces
    Then user navigates to "Do you have diabetes" Page
    And the user selects yes  for Do you have diabetes
    Then user navigates to "Do you need to take medication" Page
    And the user selects yes for Do you need to take medication
    Then user navigates to "Do you live permanently in a care home?" Page
    And the user selects yes for Do you live permanently in a care home?
    Then user navigates to "Do you get help from local council" Page
    And the user selects yes for Do you get help from local council
    Then user can apply for help with NHS costs
    Examples:
      | Country | day | month | year |
      |England    |01  | 01  | 1991|


