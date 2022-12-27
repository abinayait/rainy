package umberlla;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	
	public static void setWindow() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		WebElement element=driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
		element.click();
		Set<String> handles=driver.getWindowHandles();
		for(String newwindow: handles) {
			driver.switchTo().window(newwindow);
		}
		WebElement editbox=driver.findElement(By.xpath("//*[text()='Daily Quiz']/preceding-sibling::*[1]"));
		editbox.click();
		
		
		
	}
}
