package pages;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import wrappers.LeafTapsWrappers;
public class LoginPage extends LeafTapsWrappers {
	
	@When("Enter User Name (.*)")
	public void enterUserName(String name){
		enterById("username", name);
	}
	
	@When("Enter Password (.*)")
	public void enterPassword(String pwd){
		enterById("password", pwd);
	}
	
	@When("Click Login")
	public void clickLogin(){
		clickByClassName("decorativeSubmit");
	}
	
	@Then("Verify the Welcome Message")
	public void verifyWelcome() {
		throw new PendingException();
	}

	@Then("Verify the Logout")
	public void verifyLogout() {
		throw new PendingException();
	}
	
	@Then("Verify the Error Message")
	public void verifyErrorMessage() {
		throw new PendingException();
	}


}
