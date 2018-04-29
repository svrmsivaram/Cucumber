package pages;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.runtime.FeatureBuilder;
import wrappers.LeafTapsWrappers;

public class Hooks extends LeafTapsWrappers{
	
	@Before
	public void launchBrowser(Scenario sc) throws InterruptedException {
		invokeApp("chrome");		
		startTestCase(sc.getName(), sc.getId());
		//enterById("username", "DemoSalesManager");
		//enterById("password", "crmsfa");
		//clickByClassName("decorativeSubmit");
	}
	
	@After
	public void executeAfterScenario() {
		quitBrowser();
	}




}
