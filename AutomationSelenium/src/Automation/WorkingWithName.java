package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithName {
     
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement	createNewpageButton = driver.findElement(By.className("_6lti"));
		createNewpageButton.click();
		WebElement searchTextfield =driver.findElement(By.name("firstname"));
		searchTextfield.sendKeys("Aman@123");
}
}