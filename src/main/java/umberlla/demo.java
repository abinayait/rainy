package umberlla;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class demo extends Locators{

	/*static WebDriver web;
	public static void openingbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Seleniun\\chromedriver.exe");
		web=new ChromeDriver();
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		
		
	}
	public static void openingwebpage() {
		//web.get("http://www.livechennai.com");
		try {
		web.get("file://G:/Learning/html/Dfive/dfive.html");
		Thread.sleep(3000);
		web.findElement(username_local_html).sendKeys("hari");
		web.findElement(password_local_html).sendKeys("prasad");
		}
		catch(Exception e) {
			
		}
			
		
	}
}*/

	
	
	/*public static void textbox() {
		try {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("vadalniki"+Keys.ENTER);
		driver.navigate().back();
		
			Thread.sleep(1000);
		
	/*	driver.findElement(By.name("q")).sendKeys("greens technology"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@id='search'][1]//a[1])[1]")).click();
		*/
		/*driver.get("http://www.greenstechnologys.com/contact.php");
	WebElement name=	driver.findElement(By.xpath("//input[@id='InputName']"));
	name.sendKeys("Abinaya");
	WebElement email= driver.findElement(By.id("InputEmail1"));
	email.sendKeys("abinayavidhya315@gmail.com");
	Thread.sleep(3000);*/
	
	
	/*driver.get("https://www.leafground.com/button.xhtml");
	WebElement epoint =driver.findElement(By.xpath("https://www.leafground.com/button.xhtml"));
	Point xypoint=epoint.getLocation();
	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}*/

	
	
	public static void dropdown() {
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		WebElement ehotel=driver.findElement(By.xpath("//*[text()='Hotels']/parent::a[@href='https://www.makemytrip.com/hotels/']"));
		System.out.println(ehotel);
		ehotel.click();
		
		
		/*
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0ywzatc71bzf41nkupx1a60u778787.node0");
		WebElement element=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select select=new Select(element);
		select.selectByVisibleText("Selenium");
		try {
			Thread.sleep(2000);
			select.selectByIndex(2);
			List<WebElement> list=select.getOptions();
		int count=	list.size();
		System.out.println(count);
		}
		
		
		
		 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
	}
}