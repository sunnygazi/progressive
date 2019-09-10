package progressive.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "Features" }, glue = { "progressive.steps" }, tags = { "@UserLogin" })
public class testRunner extends AbstractTestNGCucumberTests {

}