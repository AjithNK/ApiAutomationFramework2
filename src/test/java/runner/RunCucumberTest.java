package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class RunCucumberTest extends AbstractTestNGCucumberTests {

	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }


}
