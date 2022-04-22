package com;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstSelenium {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("FirstSelenium.class");
		PropertyConfigurator.configure("log4j.properties");
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhanu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		logger.info("Chrome Opened");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		logger.info("Browser  Maximize");
		driver.get("https://www.trukky.com/door-to-door-goods-delivery");
		logger.info("App Launched");
		Thread.sleep(8000);


driver.findElement(By.xpath("//div[@class='locationBox ']/input[@placeholder='Enter pickup city']")).sendKeys("Hyderabad");
logger.info("Pickup city Hyderabad");
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()= ' Telangana, India']")).click();
logger.info("selected Telangana");
driver.findElement(By.xpath("//div[@class='locationBox ']/input[@placeholder='Enter drop city']")).sendKeys("Delhi");
logger.info("Drop city Delhi");
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()= 'New Delhi']")).click();
logger.info("New Delhi Selected");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class='submitBtn']")).click();
logger.info("clicked check price");
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='Personal']")).click();
logger.info("clicked on personal type");
Thread.sleep(3000);
driver.findElement(By.xpath("//span[text()='Few packed items ( 1 - 5 )']")).click();
logger.info("Clicked on packed 1-5 items");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='jsx-1905266029 btn primary']")).click();
logger.info("Clicked on Add material");

Thread.sleep(3000);
driver.findElement(By.xpath("//select[@class='jsx-1905266029']")).click();
logger.info("click on drop down");
//Thread.sleep(3000);
//driver.findElement(By.xpath("//select[@class='jsx-1905266029']")).click();

//Thread.sleep(3000);
//List<WebElement>dynamicList=driver.findElements(By.xpath("//select[@class='jsx-1905266029']/option"));

//Thread.sleep(3000);
driver.findElement(By.xpath("(//option[@class='jsx-1905266029'])[7]")).click();
logger.info("Selected Window AC");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='jsx-3306650702 inputBox ']/input[@placeholder='Enter No. of item']")).sendKeys("2");
Thread.sleep(3000);
logger.info("Entered 2 items");
driver.findElement(By.xpath("//div[@class='jsx-1905266029 nextBtnWrap']/button")).click();
logger.info("Forward Button");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[text()='Next']")).click();
logger.info("Next Button");
Thread.sleep(3000);
driver.findElement(By.xpath("(//button[@class='react-calendar__tile react-calendar__month-view__days__day'])/abbr[text()=28]")).click();
logger.info("Selected date 28");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='jsx-1839688868 btnRow']/button")).click();
logger.info("Next ");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Whatsapp no. recommended']")).sendKeys("8008858469");
logger.info("Whatsapp no.");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Enter email id']")).sendKeys("bhanupradeep123456@gmail.com");
logger.info("Email entered");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Enter company name']")).sendKeys("Lovely Professional University");
logger.info("Company input taken");
Thread.sleep(3000);
driver.findElement(By.xpath("//span[@class='jsx-1905266029 checkmark']")).click();
logger.info("Check Box Ticked");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[text()='Get price']")).click();
logger.info("Otp Sent to Your Phone");










//for(int i=0;i<dynamicList.size();i++)
//{
//	String text=dynamicList.get(i).getText();
//	System.out.println("Text is"+text);
//	if(text.contains("Window AC"))
//	{
//		dynamicList.get(i).click();
//		break;
//	}
//	
//}



		 
	}

}
	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class=\"hsw_autocomplePopup autoSuggestPlugin \"]/div/input")).sendKeys("Delhi");
//		

		
		

		
		
		
		
