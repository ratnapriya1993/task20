package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		//load the browser
		WebDriver driver = new  ChromeDriver();
		
		//pass the url
		driver.navigate().to("https://jqueryui.com/datepicker/");
		
		//add implisit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//window maximize
		driver.manage().window().maximize();
		
       //switch to the frame	
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	        driver.switchTo().frame(frame);
	        
	    //id locater is used for date picker
		driver.findElement(By.id("datepicker")).click();
		
		// xpath locater is used for next button click
	    driver.findElement(By.xpath("//a[@title='Next']")).click();
	    
	    // choose the calander date and month
	    driver.findElement(By.xpath("(((//table)[1]//tr)[5]//td)[6]")).click();
	    
	    WebElement datepick =  driver.findElement(By.id("datepicker"));
	    
	  //getAttribute is used to get the attribute
		String date = datepick.getAttribute("value");
		
		//next month date is printed
		System.out.println("Next Month Date:" + date);
		
        //closing all tabs opened in the browser
		driver.quit();

	    
	   
		
	  
        
	}
}
