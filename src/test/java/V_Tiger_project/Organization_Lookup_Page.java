package V_Tiger_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization_Lookup_Page {
	
	@FindBy(xpath = "//img[@alt='Create Organization...']") private WebElement lookupclick;
	
	public Organization_Lookup_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLookupclick() {
		return lookupclick;
	}
	

}
