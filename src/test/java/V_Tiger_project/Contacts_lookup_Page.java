package V_Tiger_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts_lookup_Page {
	
	@FindBy(xpath = "//img[@alt='Create Contact...']")private WebElement contlink;
	
	public Contacts_lookup_Page(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
	}

	public WebElement getContlink() {
		return contlink;
	}
	

}
