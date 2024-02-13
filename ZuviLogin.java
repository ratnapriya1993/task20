package Task20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZuviLogin {
	
	public static void main(String[] args) throws InterruptedException {
		//load the driver
    	WebDriver driver = new ChromeDriver();
    	
    	//load the url
		driver.navigate().to(" https://www.guvi.in/");
		
		//using implisittime wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//maximize the window
		driver.manage().window().maximize();
		
		// FILL ALL DETAILS FOR SIGNUP FORM
	    WebElement sign = driver.findElement(By.linkText("Sign up"));
        sign.click();
        WebElement name = driver.findElement(By.id("name"));
	    name.sendKeys("saipriya");
        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("lakshmipriya.b01@gmail.com");
        WebElement  pass = driver.findElement(By.id("password"));
        pass.sendKeys("Priya@2707");
        WebElement phone = driver.findElement(By.id("mobileNumber"));
        phone.sendKeys("9493743651");
        WebElement sig = driver.findElement(By.className("signup-btn"));
        sig.click();
        
        // VERIFING THE PAGE TITLE
         String register  = driver.getTitle();
        System.out.println("login:"+register);
        
        // back the home page
        driver.navigate().back();
        
       // click on login button
        WebElement log = driver.findElement(By.linkText("Login"));
        log.click(); 
        
     // fill all details of login 
        WebElement mail = driver.findElement(By.id("email"));
        mail.sendKeys("lakshmipriya.b01@gmail.com");
        WebElement ele = driver.findElement(By.id("password"));
        ele.sendKeys("Priya@2707");
        WebElement login2 = driver.findElement(By.id("login-btn"));
        login2.click(); 
        
        // validate the login 
        String course  = driver.getTitle(); 
         System.out.println("login success:"+course); 
         
         // using throughs declaration
        Thread.sleep(500);
        
        //close the driver
         driver.close();
	}
}

