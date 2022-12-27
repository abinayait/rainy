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
		String oldwindow=driver.getWindowHandle();
		WebElement element=driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
		element.click();
		Set<String> handles=driver.getWindowHandles();
		for(String newwindow: handles) {
			driver.switchTo().window(newwindow);
		}
		WebElement editbox=driver.findElement(By.xpath("//*[text()='Daily Quiz']/preceding-sibling::*[1]"));
		editbox.click();
		driver.close();
		driver.switchTo().window(oldwindow);
		WebElement multiplewindow=driver.findElement(By.xpath("//*[text()='Open Multiple']"));
		multiplewindow.click();
		int countwindow=driver.getWindowHandles().size();
		System.out.println(countwindow);
		WebElement multiple=driver.findElement(By.xpath("//*[text()=\"Close Windows\"]"));
		multiple.click();
	Set<String> mwindows=	driver.getWindowHandles();
	for (String windows : mwindows) {
		if(!windows.equals(oldwindow)) {
			driver.switchTo().window(windows);
			driver.close();
		}
		
	}
	}
}
