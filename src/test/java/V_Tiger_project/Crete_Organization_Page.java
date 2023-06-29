package V_Tiger_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Crete_Organization_Page {
	@FindBy(xpath = "//input[@name='accountname']")private WebElement orgname;
	@FindBy(xpath = "(//select[@class='small'])[2]")private WebElement induDpdwn;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")private WebElement savebtn;

	
	public Crete_Organization_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getOrgname() {
		return orgname;
	}


	public WebElement getInduDpdwn() {
		return induDpdwn;
	}


	public WebElement getSavebtn() {
		return savebtn;
	}
	

}
