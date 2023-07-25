package SeleniumFramework.SelemiumJavaFramework;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CheckoutPage;
import PageObjects.ConfirmationPage;
import PageObjects.LandingPage;
import PageObjects.ProductCatalog;
import PageObjects.cartPage;
import Testcomponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest extends BaseTest {

	
	
	@Test
	public  void submitorder() throws IOException, InterruptedException 
	{
		String productName="ZARA COAT 3";
		ProductCatalog productcat=landingpage.loginApplication("sireesha.mocharla@gmail.com", "Sireesha@1023");
		List<WebElement> products=productcat.getProductList();
		productcat.addProductCart(productName);
		cartPage cartpage=productcat.goToCartPage();
		Boolean match=cartpage.verifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage checkoutpage=cartpage.goTocheckOut();
		checkoutpage.Selectcountry("india");
		ConfirmationPage confirmmessage=checkoutpage.submitOrder();
		String confirmationmessge=confirmmessage.confirmationmessage();
		Assert.assertTrue(confirmationmessge.equalsIgnoreCase(" THANKYOU FOR THE ORDER."));
	}
	
	
	@Test(dependsOnMethods= {"submitorder"})
	public void OrderHistoryTest() 
	{
		
		ProductCatalog productcat=landingpage.loginApplication("sireesha.mocharla@gmail.com", "Sireesha@1023");

		
		
		
		
		
		
	}
	
	
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	


