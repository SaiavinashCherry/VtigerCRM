package V_Tiger_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creating_New_Contacts {

	@FindBy(xpath = "")private WebElement firsttext;
	@FindBy(xpath = "")private WebElement lasttext;
	@FindBy(xpath = "")private WebElement savebtn;

	public Creating_New_Contacts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirsttext() {
		return firsttext;
	}

	public WebElement getLasttext() {
		return lasttext;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
}
