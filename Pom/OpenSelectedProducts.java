package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenSelectedProducts 
{

	@FindBy(xpath = "//a[text()='90 cm']")
	public static WebElement selectSize;
	
	@FindBy(xpath = "//button[text()='BUY NOW']")
	public static WebElement buyNow;

	
}
