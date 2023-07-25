package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstarctComponents.abstarctComponenent;

public class ConfirmationPage extends abstarctComponenent {
WebDriver driver;
	
	public ConfirmationPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

	
	
	
	@FindBy(css=".hero-primary")
	WebElement confirmationmessge;
	
	
	public String confirmationmessage() 
	{
		return confirmationmessge.getText();
	}
}
