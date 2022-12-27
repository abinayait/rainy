package umberlla;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton  {

	public static void setRadioButton() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
	WebElement chro=	driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]/span"));
		chro.click();
		driver.findElement(By.xpath("//*[text()='Find the default select radio button']/..//td[2]")).click();
		
		String c= "//*[text()='Find the default select radio button']/..//td";
		
		List<WebElement> checked=driver.findElements(By.xpath(c));
		
		for(WebElement we : checked) {
			String name=we.getText();
			String d ="//*[text()='Find the default select radio button']/..//label[text()='"+name+"']/ancestor::td//input";
			System.out.println(d);
			System.out.println(name + " : " + driver.findElement(By.xpath(d)).isSelected());
			
		}
		
		

		
		
	}
}
