package Flipkart;

import java.security.Key;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM.Login;
import POM.OpenSelectedProducts;
import POM.SearchProducts;

public class Fpkart 
{
	WebDriver d;

	@Test(priority = 1)
	void Run()
	{
		System.setProperty("webdriver.chrome.driver","/home/qq383/Selenium/Driver/chromedriver");
		
		d= new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		
	}
	
	@Test(priority = 2,description = "Login")
	void Login() throws InterruptedException
	{

		PageFactory.initElements(d,Login.class);
		
		Login.usrName.sendKeys("8838351336");
		Login.pswd.sendKeys("Selena@1999");
		Login.login.click();
		
		Thread.sleep(3000);
	}
	
	@Test(priority = 3,description = "Searchproducts")
	void SearchProduct() throws InterruptedException
	{
		PageFactory.initElements(d,SearchProducts.class);
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SearchProducts.searchProduct.sendKeys("Panda");
		SearchProducts.searchProduct.sendKeys(Keys.ENTER);
		
		WebDriverWait wait=new WebDriverWait(d,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'HONEYDEAL Teddy Bear with Neck Bow Premium Quality Soft...')]")));
		SearchProducts.selectProduct.click();
		Thread.sleep(3000);


	}
	
	
	@Test(priority = 4,description = "Buynow")
	void BuyNow()
	{
		PageFactory.initElements(d,OpenSelectedProducts.class);

		String s=d.getWindowHandle();
		
		Set<String> winHandle=d.getWindowHandles();
		ArrayList<String> win=new ArrayList<String>(winHandle);
		d.switchTo().window(win.get(1));
		
		OpenSelectedProducts.selectSize.click();
		OpenSelectedProducts.buyNow.click();
		
		

	}
	

}
