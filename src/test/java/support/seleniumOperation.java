package support;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumOperation { 
public static WebDriver driver= null;

public static void browserLaunch(Object[] inputparameters) 
{
	String strbrowsername= (String) inputparameters[0];
	String strxpath= (String) inputparameters[1];
	
		if(strbrowsername.equalsIgnoreCase("Chrome"))
			{
			System.setProperty("webdriver.chrome.driver", strxpath);
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			}
		else if(strbrowsername.equalsIgnoreCase("Firefox"))
			{
			System.setProperty("webdriver.gecko.driver", strxpath);
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
     		 }
}

//open Application     	//url
	public static void strurl(Object[]inputparameters) throws Throwable
	{
		String input_url= (String) inputparameters[0];
		driver.get(input_url);
	}	

	//passing value by sendkey method
	
	public static void sendkey1(Object []inputparameters) throws Throwable
	{
		String first_input= (String)inputparameters[0];
		String second_input= (String)inputparameters[1];
		
		WebElement element=driver.findElement(By.xpath(first_input));
		element.sendKeys(second_input);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	//Click method
		public static void click_method(Object[]inputparameters) throws Throwable
		{    
			String StrClick = (String)inputparameters[0];
			WebElement clickelement= driver.findElement(By.xpath(StrClick));
			clickelement.click();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}

//Closed method
		public static void closebutton(Object[]inputparameters)
		{
			String button= (String)inputparameters[0];
driver.findElement(By.xpath(button)).click();
driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}
		
		//movve to login
		public static void loginwindow(Object[]inputparameters)
		{
			String lwindow=(String)inputparameters[0];
			
			 Actions act= new Actions(driver);
			WebElement element=driver.findElement(By.xpath(lwindow));
			act.moveToElement(element).build().perform();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
		}
		
		//click on login
        public static void gettingtext(Object[]inputparameters) throws Throwable
        {
        	Thread.sleep(5000);
        	String xpath= (String)inputparameters[0];
        WebElement  textele=driver.findElement(By.xpath(xpath));
        String text1=textele.getText();
        
        String text=(String)inputparameters[1];
        if(text1.equalsIgnoreCase(text)) 
        {
        	System.out.println("Test case passed");
        }
        else
        {
        	System.out.println("Test case Notpassed");
        }
        }
		public static void wait1()
		{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}
 
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		Object [] input= new Object[2];
		  
		   //launch the browser 
		 input[0]="Chrome";
		 input[1]= "D:\\software_Testing\\Automation_support\\chromedriver.exe";
		 browserLaunch(input); 
	
					//passing url(calling url)
					Object[] input1=new Object[1];
							 input1[0]="https://www.flipkart.com/";
							 strurl(input1);
							 
							 
							 
							 Object[] input2=new Object[1];//cancle button
							 			input2[0]="//*[@class='_2KpZ6l _2doB4z']";
							 			click_method(input2);
							 			
							 			wait1();//implicit wait function call	
							 			
							 			Object[] input3=new Object[1];
							 			input3[0]="//*[text()='Login']";
							 			loginwindow(input3);
							 			
							 			Object[] input4=new Object[1];//click on my profile
							 			input4[0]="//*[text()='My Profile']";
							 			click_method(input4);
							 			wait1();
							 			
							 			Object[] input5=new Object[2];//enter user name
							 			input5[0]="//*[@class='_2IX_2- VJZDxU']";
							 			input5[1]="9822741789";
							 			sendkey1(input5);
							 			
							 			Object[] input6=new Object[2]; //enter password
							 			input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
							 			input6[1]="ganeshrutuja";
							 			sendkey1(input6);
							 			
							 			Object[] input7=new Object[1];//enter submit
							 			input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
							 			click_method(input7);
							 			
							 			

							 			
							 			
									 
	

	}

}
