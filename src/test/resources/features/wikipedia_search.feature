Feature: Wikipedia Search Functionality Title Verification
  As a user , when I am on the Wikipedia search page
  I should be able to search whatever I want and see relevant information

  Background:
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    When user clicks wiki search button

  @B2G3-218 @B2G3-152
  Scenario: Wikipedia Search Functionality Title Verification
    Then user sees "Steve Jobs" is in the wiki title

  @B2G3-219 @B2G3-152
  Scenario:Wikipedia Search Functionality Header Verification
    Then user sees "Steve Jobs" is in the wiki header

  @B2G3-220 @B2G3-152
  Scenario:Wikipedia Search Functionality Image Header Verification
    Then user sees "Steve Jobs - Wikipedia" is in the image header