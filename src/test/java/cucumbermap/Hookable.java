package cucumbermap;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookable {
@Before
public void before(Scenario scenario) throws UnknownHostException
{
	System.out.println("-------------scenario start------------");

}

@After
public void after(Scenario scenario) 
{
	System.out.println("-------------scenario end------------");
	}

}

