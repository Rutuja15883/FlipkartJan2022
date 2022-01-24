package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trial {

	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software_Testing\\Automation_support\\chromedriver.exe");
		 ChromeDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 //click on cancle button
		 driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 
		 
		 //move to element
		 Actions act= new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//*[text()='Login']"));
		act.moveToElement(element).build().perform();
		//click on by myprofile
		
		driver.findElement(By.xpath("//*[text()='My Profile']")).click();
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("9822741789");
		driver.findElement(By.xpath("(//*[@type='password'])[1]")).sendKeys("ganeshrutuja");
		driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		
		/*driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("rutujasaipawar@gmail.com");
		//driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("9822741789");
		driver.findElement(By.xpath("(//*[@type='password'])[1]")).sendKeys("Aadi_Ganesh");
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();*/
		
		
	}
}
