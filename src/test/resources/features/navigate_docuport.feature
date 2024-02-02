Feature: Validate left menu outline in Docuport for 3 users

  @B2G3-249  @wip
  Scenario Outline: Login to Docuport and validate the left menu option
    Given user is on Docuport login page
    Then user is on home page Docuport "<Role>"
    Then validate left navigator items of Docuport for all "<Role>"
      | client    | Home | Received docs | My uploads | Invitations | 1099 Form   | Reconciliations |           |                 |           |                 |
      | employee  | Home | Received docs | My uploads | Clients     | Users       | Bookkeeping     | 1099 Form | Reconciliations |           |                 |
      | advisor   | Home | Received docs | My uploads | Clients     | Invitations | Users           | Leads     | Bookkeeping     | 1099 Form | Reconciliations |
    Examples:
      |Role    |
      |client  |
      |employee|
      |advisor |




