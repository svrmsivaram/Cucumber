Feature: Hide the 3 Hours Forecast Details

Scenario Outline: Hide the 3 hours forcast details (Positive Case)
When Enter the City as <CityName>
And Click on the Enter Key
And click on the Day
And click on the Day again
Then Verify 3 hourly forecast is hided


Examples:
|CityName  |
|Edinburgh |
|Aberdeen  |