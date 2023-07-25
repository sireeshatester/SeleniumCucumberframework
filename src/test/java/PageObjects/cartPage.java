package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import AbstarctComponents.abstarctComponenent;

public class cartPage extends abstarctComponenent {
	
	WebDriver driver;
	public  cartPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css=".cartSection h3")
	List<WebElement> cartproducts;
	
	
	@FindBy(css=".totalRow button")
	WebElement checkoutele;
	
	
	public Boolean verifyProductDisplay(String productName) 
	{
		Boolean match=cartproducts.stream().anyMatch(cartproduct->cartproduct.getText().equalsIgnoreCase(productName));
		return match;
		
	}
	
	
	public CheckoutPage goTocheckOut() 
	{
		checkoutele.click();
		return new CheckoutPage(driver);
	}
}
