Feature: Get 3 Hours Forecast Details

Scenario Outline: Get 3 hours forcast details (Positive Case)
When Enter the City as <CityName>
And Click on the Enter Key
And click on the Day
Then verify 3 hourly forecast details

Examples:
|CityName  |
|Edinburgh |
|Aberdeen  |