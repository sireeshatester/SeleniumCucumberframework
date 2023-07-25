package StepDefintions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjects.CheckoutPage;
import PageObjects.ConfirmationPage;
import PageObjects.LandingPage;
import PageObjects.ProductCatalog;
import PageObjects.cartPage;
import Testcomponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsFile extends BaseTest{

	public LandingPage landingpage;
	public ProductCatalog productcat;
	public ConfirmationPage confirmationpage;

	
	
	@Given("I landed on Ecommerce page")
	public void i_landed_on_ecommerce_page() throws IOException
	{
		landingpage=LaunchApplication();
		
	}
	
	
	@Given("^Logged i with username (.+) and password (.+)$")
	public void logged_i_with_username_sireesha_mocharla_gmail_com_and_password_sireesha(String username,String password) 
	{
	   
		productcat=landingpage.loginApplication(username, password );
		
	}
	
	@When("^I add the (.+) to cart$")
	public void i_add_the_zara_coat_to_cart(String productName) throws InterruptedException 
	{
		List<WebElement> products=productcat.getProductList();
		productcat.addProductCart(productName);
	}
	
	@When("^Checkout (.+) and submit the order$")
	public void checkout_zara_coat_and_submit_the_order(String productName) {
		cartPage cartpage=productcat.goToCartPage();
		Boolean match=cartpage.verifyProductDisplay(productName);
		Assert.assertTrue(match);
		CheckoutPage checkoutpage=cartpage.goTocheckOut();
		checkoutpage.Selectcountry("india");
		confirmationpage=checkoutpage.submitOrder();
	}
	
	@Then("{string} messge is displayed on ConfirmationPage")
	public void messge_is_displayed_on_confirmation_page(String string) {
		String confirmationmessge=confirmationpage.confirmationmessage();
		Assert.assertTrue(confirmationmessge.equalsIgnoreCase(string));
	}

	
	



	
	

}
