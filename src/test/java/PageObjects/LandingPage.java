package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstarctComponents.abstarctComponenent;

public class LandingPage extends abstarctComponenent {
	
	WebDriver driver;
	
	public  LandingPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="userEmail")
	WebElement userEmail;

	@FindBy(id="userPassword")
	WebElement userpassword;
	
	
	@FindBy(id="login")
	WebElement submit;
	

	@FindBy(css="[class='flyInOut']")
	WebElement errorMessage;
	
	
	
	public ProductCatalog loginApplication(String email,String password) 
	{
		userEmail.sendKeys(email);
		userpassword.sendKeys(password);
		submit.click();
		ProductCatalog productcat=new ProductCatalog(driver);
		return productcat;
	}
	
	
	public String getErroemesaage() 
	{
		waitforWebElementAppear(errorMessage);
		return errorMessage.getText();
		
	}
	
	public void goTo() 
	{
		driver.get("https://rahulshettyacademy.com/client/");
	}
	
	
}
