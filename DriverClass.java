import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {


    public static void main(String[] args) {
    	System.setProperty("webdriver.firefox.marionette","location_of_firefox_web_driver");
		  WebDriver driver = new FirefoxDriver();
		
        String baseUrl = "https://github.com/login";
       

        driver.get(baseUrl);

        
       WebElement username=driver.findElement(By.id("login_field"));
       username.sendKeys("username");
       
       WebElement password=driver.findElement(By.id("password"));
       password.sendKeys("password");
       
       WebElement login_button=driver.findElement(By.name("commit"));
       login_button.click();
       
    }

}
