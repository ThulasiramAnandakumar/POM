package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProducts 
{
	
	@FindBy(name = "q")
	public static WebElement searchProduct;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement Search;
	
	@FindBy(xpath = "//a[contains(text(),'HONEYDEAL Teddy Bear with Neck Bow Premium Quality Soft...')]")
	public static WebElement selectProduct;

}
