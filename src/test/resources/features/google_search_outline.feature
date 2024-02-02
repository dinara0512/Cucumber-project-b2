Feature: Scenario outline practice
@smoke123
 Scenario Outline: Google search for capital cities
   Given user is on Google search page
   When user searches for the "<country>"
   Then user should see the "<capital>" in the result
   Examples:
   |country|capital|
   |Azerbaijan | Baku|
   |Ukraine    |Kyiv |
   |Afghanistan|Kabul|
   |Turkiye    | Ankara   |
   |Uzbekistan | Tashkent |
