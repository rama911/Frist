package MyHBF;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LogIn {
	
	public static WebDriver driver;
	
	 @BeforeTest
	 
	  public void SetUp() {
		 
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\rama\\Documents\\Tools\\geckodriver");
		 
		 FirefoxDriver driver = new FirefoxDriver();
		 
		 driver.get("https://www.hbf.com.au/myhbf/login");
		 
		 driver.manage().window().maximize();
		 		 
	  }
	
  @Test
  public void LoginValid() {
	  
	  driver.findElement(By.xpath("//*[@id=\"MemberNumber\"]")).sendKeys("12345");
	  
	  driver.findElement(By.xpath("//*[@id=\"loginPassword\"]")).sendKeys("Password");
	  
	  driver.findElement(By.xpath("//*[@id=\"btnMyHbfLogin\"]")).click();
	  
	  WebDriverWait wait =  new WebDriverWait (driver,20) ;
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_from_loginpage")));  
	  
	  System.out.println("This is a test");
  }
 

  

  

}
