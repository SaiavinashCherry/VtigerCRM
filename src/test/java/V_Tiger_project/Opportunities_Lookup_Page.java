package V_Tiger_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opportunities_Lookup_Page {
	 
	@FindBy(xpath = "//img[@alt='Create Opportunity...']")private WebElement opplink;
	
	public Opportunities_Lookup_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOpplink() {
		return opplink;
	}
	
}
