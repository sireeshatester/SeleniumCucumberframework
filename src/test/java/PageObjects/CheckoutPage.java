package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstarctComponents.abstarctComponenent;

public class CheckoutPage extends abstarctComponenent{
	
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(css="[placeholder='Select Country']")
	WebElement country;
	
	
	@FindBy(xpath="//button[contains(@class,'ta-item')][2]")
	WebElement SelectCountry;
	
	
	@FindBy(css=".action__submit")
	WebElement action;
	
	
	By results=By.cssSelector(".ta-results.list-group.ng-star-inserted");
	
	
	public void Selectcountry(String countryName) 
	{
		Actions a=new Actions(driver);
		a.sendKeys(country,countryName).build().perform();
		waitforElementAppear(results);
		SelectCountry.click();
	}
	
	
	public ConfirmationPage submitOrder() 
	{
		action.click();
		return new ConfirmationPage(driver);
	}

}
