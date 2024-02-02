Feature: Create a new client as advisor
  @task17
  Scenario:Validate a new client creation by advisor
     Given user logins as "advisor"
     When user goes to "Clients"
     And create a new personal client
    |first name   |White              |
    |last name    |Walter             |
    |email        |mr.white93@gmail.com|
    |phone number |7654322            |
    |password     |Skyler1            |
    |ssn          |000211222          |
    Then user search for the created profile
    |email        |mr.white93@gmail.com|
    Then user logs out
    Then user logs in as a new client
    |email        |mr.white93@gmail.com|
    |password     |Skyler1            |
    Then user logs out
