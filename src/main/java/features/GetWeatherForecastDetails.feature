Feature: Get 5 days Weather Forecast Details


Scenario Outline: Get 5 day Weather Forecast Details (Positive Cases)
When Enter the City as <CityName>
And Click on the Enter Key
Then Verify 5 days forecast details

Examples:
|CityName  |
|Edinburgh |
|Aberdeen  |

Scenario Outline: Get 5 day Weather Forecast Details (Negative Cases)
When Enter the City as <CityName>
And Click on the Enter Key
Then Verify Error message

Examples:
|CityName |
|Chennai  |
|Te        |


