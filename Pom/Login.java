package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login 
{
	@FindBy(xpath = "(//input[@type='text'])[2]")
	public static WebElement usrName;
	
	@FindBy(xpath = "//input[@type='password']")
	public static WebElement pswd;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public static WebElement login;

}
