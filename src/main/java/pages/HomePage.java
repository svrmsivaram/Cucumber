package pages;

import cucumber.api.java.en.*;
import wrappers.LeafTapsWrappers;
public class HomePage extends LeafTapsWrappers {
	
	
	@When("Click CRMSFA")
	public void clickCreateLead(){
		clickByLink("CRM/SFA");
	}
	
	


}
