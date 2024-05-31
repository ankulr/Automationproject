package ActinClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		
		
		//to create object of action class
		Actions a =new Actions(driver); 
		
		
		//identify the web element
             
		WebElement mouseHover =driver.findElement(By.linkText("Paytm for Consumer"));
		
		// use the method
		
		a.moveToElement(mouseHover).perform();
		
	WebElement mouseHover2=driver.findElement(By.linkText("Payments"));
	
	  Thread.sleep(2000);
		a.moveToElement(mouseHover2).perform();
		a.click(driver.findElement(By.linkText("Online Payments"))).perform();
		
		
		
		
		
		
		
		
		

	}

}
