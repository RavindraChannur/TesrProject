package common;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Channur\\Selenium Projects\\com.test\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");
		
//		
//		Set<String>ids=driver.getWindowHandles();
//		Iterator<String> it=ids.iterator();
//		String parent=it.next();
//		String child=it.next();
//		
//		//driver.switchTo().window(parent);
////		driver.switchTo().window(child);
////		driver.getTitle();
//		
//		for(String st: ids)
//		{
//			System.out.println(st);
//			
//		}
		
////		
//		WebDriverWait t=new WebDriverWait(driver, 10);
//		t.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(""))));
//		
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(“statedropdown”)));
//		
//		WebDriverWait e=new WebDriverWait(driver, 20);
//		e.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
//		
//		
//		
////	
//		
//		
//		
//		
//		WebDriverWait w= new WebDriverWait(driver, 5);
//		
//		
//		
		
		
		
		
		
		
		
	}

}
