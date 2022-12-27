package umberlla;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	
	public static void setAlert() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		try {
		WebElement element=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span[2]"));
		element.click();	
	
			Thread.sleep(2000);
			Alert confirmalert=driver.switchTo().alert();
			confirmalert.accept();
	 
		
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void setPrompt() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement promptex=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		promptex.click();
		Alert promptalt=driver.switchTo().alert();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		promptalt.sendKeys("hello"+Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		promptalt.accept();
	}
}
