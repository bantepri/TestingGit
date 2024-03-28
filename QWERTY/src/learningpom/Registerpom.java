package learningpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpom {

	
	//constructor
	public Registerpom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
}
	@FindBy(linkText= "Register")       //1.baseclass 2.pomclass 3.  extend baseclass in new class
	private WebElement register;
	
	@FindBy(linkText = "Log in")
	private WebElement loginbutton;

	public WebElement getregister() {
		return register;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	
	
	
	
	
	
	
}
