package pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wrappers.LeafTapsWrappers;

public class WeathetForcastPage extends LeafTapsWrappers {
	
	@When("Enter the City as (.*)")
	public void enter_City_Name(String cityName){
		enterById("city",cityName);
	}
	
	@And("Click on the Enter Key")
	public void clickEnterKey(){
		pressEnterKeybyId("city");
	}
	
	@Then("Verify 5 days forecast details")
	public void verifyForeCastDetails(){
		if(getCountOfElementsbyXpath("//span[starts-with(@data-test,'day-')]") == 5){
			reportStep("Getting 5 days forecast details","PASS");
		}
		else
		{
			reportStep("Not Getting 5 days forecast details", "FAIL");
		}
		
	}
	
	@Then ("Verify Error message")
	public void verifyErrorMessage(){
		verifyTextByXpath("//div[@data-test='error']","Error retrieving the forecast");
	}
	
	@And("click on the Day")
	public void clickOntheDay(){
		clickByXpath("//span[@data-test='day-1']");
	}
	
	@Then("verify 3 hourly forecast details")
	public void verifyThreeHours(){
		String hour2 =getTextByXpath("//span[@data-test='hour-1-2']");
		String hour1 =getTextByXpath("//span[@data-test='hour-1-1']");
		int h1 = Integer.parseInt(hour1);
		int h2= Integer.parseInt(hour2);
		if(((h2-h1)/100)==3){
			reportStep("Getting 3 Hours Forecast Details", "PASS");
		}
		else{
			reportStep("Not Getting 3 Hours Forecast Details", "FAIL");
		}
	}
	
	@And("click on the Day again")
	public void clickOntheDayAgain(){
		clickByXpath("//span[@data-test='day-1']");
	}
	
	@Then("Verify 3 hourly forecast is hided")
	public void verifyThreeHourslyForecastHide(){
		
		if(getElementEnableStatusbyXpath("//span[@data-test='hour-1-2']") == false){
			reportStep("3 Hourly forecast is hided", "PASS");
		}
		else
		{
			reportStep("3 Hourly forecast is not Hided", "FAIL");
		}
	}
	
	@Then("Weather Condition is most dominated or current condition")
	public void verifyWeatherConditon(){
		
		List<WebElement> ele =getDriver().findElementsByXPath("//*[starts-with(@data-test,'description-1-')]");
		List<String> rainfall = new ArrayList<>();
		for (WebElement eachElement : ele) {
			rainfall.add(eachElement.getAttribute("aria-label"));
		}
		
		System.out.println(rainfall);
		HashMap<String, Integer> rainfallval = new HashMap<String, Integer>();
		int value=1;
		for (String string : rainfall) {
			
			if(rainfallval.containsKey(string)){
				value = rainfallval.get(string)+1;
				rainfallval.put(string, value);
			}
			else {
				rainfallval.put(string, value);
			}
		}

		System.out.println(rainfallval);
		String key =null;
		for(Entry<String,Integer> e: rainfallval.entrySet()){
			for (Entry<String,Integer> e1: rainfallval.entrySet()) {
				if(e.getValue() > e1.getValue()){
					key = e.getKey();
				}
			}
		}
		
		
		
		
		
		/*int val = (Integer) Collections.max(rainfallval.values());
		
		String maxval = rainfallval.entrySet()
		
		System.out.println(rainfallval);
		Collections.sort*/
		
		
	}
	
}
