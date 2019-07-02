import org.openqa.selenium.firefox.FirefoxDriver;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\rama\\Documents\\Tools\\geckodriver\\geckodriver.exe");
		 
		 FirefoxDriver driver = new FirefoxDriver();
		 
		 driver.get("http://www.google.com");
		 
		 driver.manage().window().maximize();

	}

}
