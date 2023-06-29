package V_Tiger_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	//Declaration
	@FindBy(xpath = "//input[@name='user_name']")private WebElement lgntxt;
	@FindBy(xpath = "//input[@name='user_password']")private WebElement pwdtxt;
	@FindBy(xpath = "//input[@id=\\\"submitButton\\\"]")private WebElement loginbtn;
	
	//Intialization
	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}

	public WebElement getLgntxt() {
		return lgntxt;
	}

	public WebElement getPwdtxt() {
		return pwdtxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	

}
