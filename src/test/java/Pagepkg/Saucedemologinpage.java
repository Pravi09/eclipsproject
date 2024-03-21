package Pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemologinpage {
	
	
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")
	WebElement firstitem;
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")
	WebElement seconditem;
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")
	WebElement thirditem;
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[4]/div[3]/button")
	WebElement fourthitem;
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[5]/div[3]/button")
	WebElement fifthitem;
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button")
	WebElement sixthitem;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
	WebElement checkout;
	@FindBy(id="first-name")
	WebElement firstname;
	@FindBy(id="last-name")
	WebElement lastname;
	@FindBy(id="postal-code")
	WebElement zipcode;
	@FindBy(xpath="//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")
	WebElement continu;
	@FindBy(xpath="//*[@id=\"menu_button_container\"]/div/div[3]/div/button")
	WebElement menu;
	@FindBy(xpath="//*[@id=\"inventory_sidebar_link\"]")
	WebElement allitems;
	@FindBy(id="logout_sidebar_link")
	WebElement logout;
	
	
	public Saucedemologinpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	public void clickloginbtn()
	{
		login.click();
	}
	public void setvalues(String un, String pwd)
	{
		username.clear();
		username.sendKeys(un);
		password.clear();
		password.sendKeys(pwd);
	}
	public void Addtocart()
	{
		firstitem.click();
		seconditem.click();
		thirditem.click();
		fourthitem.click();
		fifthitem.click();
		sixthitem.click();
	}
	public void clickcart()
	{
		cart.click();
	}
	public void checkout()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		checkout.click();
	}
	public void adddetails()
	{
		firstname.sendKeys("praveen");
		lastname.sendKeys("paul");
		zipcode.sendKeys("680613");
		continu.click();
	}
	public void hamburgermenu()
	{
		menu.click();
		allitems.click();
	}
	public void logout()
	{
		menu.click();
		logout.click();
	}
	
	
	

}
