package V_Tiger_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts_Information_Page {
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")private WebElement continflink;
	
	public Contacts_Information_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getContinflink() {
		return continflink;
	}
	
}
