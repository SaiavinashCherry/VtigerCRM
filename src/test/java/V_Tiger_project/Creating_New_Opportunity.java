package V_Tiger_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Creating_New_Opportunity {
	
	@FindBy(xpath = "//input[@name='potentialname']")private WebElement firsttext;
	@FindBy(xpath = "(//input[@class='crmbutton small save'])[1]")private WebElement savebtn;
	

}
