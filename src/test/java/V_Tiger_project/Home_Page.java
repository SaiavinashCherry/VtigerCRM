package V_Tiger_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	@FindBy(xpath = "//a[text()='Organizations']")private WebElement orglink;
	@FindBy(xpath = "//a[text()='Contacts']")private WebElement contlink;
	@FindBy(xpath = "//a[text()='Opportunities']")private WebElement opplink;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")private WebElement adminimg;
	@FindBy(xpath = "//a[text()='Sign Out']")private WebElement singoutlink;
	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getContlink() {
		return contlink;
	}

	public WebElement getOpplink() {
		return opplink;
	}

	public WebElement getAdminimg() {
		return adminimg;
	}

	public WebElement getSingoutlink() {
		return singoutlink;
	}
	
	

}
