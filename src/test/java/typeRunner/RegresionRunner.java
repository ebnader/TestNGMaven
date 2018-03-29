package typeRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test
@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/java"}
,glue={""}
//,plugin={""}
,tags={"@regresion"}
)
public class RegresionRunner extends AbstractTestNGCucumberTests{

}


