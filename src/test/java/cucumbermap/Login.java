package cucumbermap;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import support.seleniumOperation;

public class Login {

	@Given("user open \"Chrome\"browser with exe {string}")
	public void user_open_chrome_browser_with_exe(String string)
	{
		Object [] input= new Object[2];
				  input[0]="Chrome";
				  input[1]= "D:\\software_Testing\\Automation_support\\chromedriver.exe";
	 seleniumOperation.browserLaunch(input); 
	   	}

	@Given("user open url {string}")
	public void user_open_url(String string) throws Throwable
	{
		Object[] input1=new Object[1];
		 input1[0]="https://www.flipkart.com/";
		 seleniumOperation.strurl(input1);
	}

	@When("user click on cancle button")
	public void user_click_on_cancle_button() throws Throwable
	{
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		seleniumOperation.click_method(input2);
	}

	@When("user move on login dropdown")
	public void user_move_on_login_dropdown()
	{
		 Object[] input3=new Object[1];
			input3[0]="//*[text()='Login']";
			seleniumOperation.loginwindow(input3);
		}

	@When("user click on my profile")
	public void user_click_on_my_profile()throws Throwable
	{  
		Object[] input4=new Object[1];//click on my profile
			input4[0]="//*[text()='My Profile']";
			seleniumOperation.click_method(input4);
	  }

	@When("user enter username as {string}")
	public void user_enter_username_as(String string) throws Throwable
	{Object[] input5=new Object[2];//enter user name
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]="9822741789";
		seleniumOperation.sendkey1(input5);
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String string)throws Throwable
	{
		Object[] input6=new Object[2]; //enter password
			input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
			input6[1]="ganeshrutuja";
			seleniumOperation.sendkey1(input6);
			
	}

	@When("user click on Login button")
	public void user_click_on_login_button()throws Throwable
	{Object[] input7=new Object[1];//enter submit
		input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		seleniumOperation.click_method(input7);
		
}

	@Then("Application show user profile") 
	public void application_show_user_profile()
	{
		
	  	
	}


}
