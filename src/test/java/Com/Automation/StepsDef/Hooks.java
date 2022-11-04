package Com.Automation.StepsDef;


import Com.Automation.genericUtils.PropertyReader;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void precondition() 
	{
		PropertyReader.initProperty();	
	}

}
