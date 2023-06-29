package V_Tiger_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization_Information_Page {
	
	@FindBy(xpath = "//span[@class='dvHeaderText']") private WebElement orginftext;
	

	public Organization_Information_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getOrginftext() {
		return orginftext;
	}
	
}
