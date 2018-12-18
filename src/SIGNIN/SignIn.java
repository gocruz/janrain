package JNJMD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {

	public static void main(String[] args) throws InterruptedException {

				
// Create a new instance of the Firefox driver
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\gabrielacruz\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		
	 
//Launch QA landing page
		 driver.get("http://customer-dev.janrain.com/widgets/afe5e909e44d/index.html");
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 		 
// Print a  message to the screen
		 System.out.println("Successfully opened the website App Reference MD");
		 
//Click on the SIGN UP link
		 WebElement signuplink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"captureSignInLink\"]")));
		 signuplink.click();
		 
//Click on the SIGN UP button
		 WebElement signupbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		 signupbtn.click();
		 
//Enter quote text
		 driver.findElement(By.xpath("//input[@id='capture_traditionalRegistration_emailAddress']")).sendKeys("gabrielacruz+test@ciandt.com");
		 driver.findElement(By.xpath("//input[@id='capture_traditionalRegistration_emailAddressConfirm']")).sendKeys("gabrielacruz+test@ciandt.com");
		 driver.findElement(By.xpath("//input[@id='capture_traditionalRegistration_newPassword']")).sendKeys("Test123@");
		 driver.findElement(By.xpath("//input[@id='capture_traditionalRegistration_firstName']")).sendKeys("Gabriela");
		 driver.findElement(By.xpath("//input[@id='capture_traditionalRegistration_lastName']")).sendKeys("Cruz");
		 driver.findElement(By.xpath("//input[@id='capture_traditionalRegistration_termsConditionsOptInAgreement']")).click();
		 driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]")).click();
		 
		 
		 // WebElement presto = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='submit-form']//*[@value='Presto change-o!']")));
		// presto.click();
		 
//Enter name/age
		// WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Add first name']")));
		 //name.sendKeys("Selenium");
		 //WebElement arrow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='poster-signature__next']")));
		 //arrow.click();
	

//Wait for 5 Sec
		 Thread.sleep(5000);
		 
// Close the driver
// driver.quit();

	}

}
