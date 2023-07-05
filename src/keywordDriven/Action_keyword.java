package keywordDriven;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;
import utility.LocatorValues;

public class Action_keyword {
	
	
	public static WebDriver driver;

	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void navigate() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
	}

	public void enterUserName() {
		driver.findElement(By.xpath(LocatorValues.txtbx_UserName)).sendKeys(Constants.username);
	}

	public void enterPassword() {
		driver.findElement(By.xpath(LocatorValues.txtbx_Password)).sendKeys(Constants.password);
	}

	public void clickSignIn() {
		driver.findElement(By.xpath(LocatorValues.btn_LogIn)).click();
	}
	
	public void ClickOnAddToCart( ) {
		driver.findElement(By.xpath(LocatorValues.btn_AddToCart)).click();
	}
	
	public void clickOnIcon() {
		driver.findElement(By.xpath(LocatorValues.btn_cartIcon)).click();
	}
	
	public void clickOnRemove( ) {
		driver.findElement(By.xpath(LocatorValues.btn_checkout)).click();
		
	}
	
	public void clickOnMenu( ) {
		driver.findElement(By.xpath(LocatorValues.buttn_menu)).click();
		
	}
	public void logout() {
		driver.findElement(By.xpath(LocatorValues.btn_logout)).click();
	}

	public void closeBrowser() {
		driver.quit();
	}
}