package flipkart;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkartTesting {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.flipkart.com/");
	        driver.manage().window().maximize();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        
	        driver.findElement(By.name("q")).sendKeys("iphone 16" + Keys.ENTER);
	        driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 16 (Teal, 256 GB)']")).click();
	        
	        Thread.sleep(2000);
	        
	        // 🔹 Switch to new tab
	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1)); // new tab

	        WebElement Addtocart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Add to cart')]")));
	        Addtocart.click();
	        
	        System.out.println("Product added to cart successfully.");
            
	       
	}
	

}
