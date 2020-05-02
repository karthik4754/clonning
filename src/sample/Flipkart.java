package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\apple\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement clic = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	clic.click();
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
			search.sendKeys("iphone 8",Keys.ENTER);
		
	 Thread.sleep(5000);	
	 List<WebElement> li = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
	 WebElement li1 = li.get(0);
	 li1.click();
	 Set<String> allwindows = driver.getWindowHandles();
	 List<String> lis  = new ArrayList<String>();
	 lis.addAll(allwindows);
	 driver.switchTo().window(lis.get(1));
	 driver.manage().window().maximize();
	 WebElement cart = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
	 cart.click();
	 Thread.sleep(5000);
	 WebElement text = driver.findElement(By.xpath("//span[text()=' ₹36,999']"));
	 String price = text.getText();
	 System.out.println(price);
	 
	 
	 

	  
	}

}
