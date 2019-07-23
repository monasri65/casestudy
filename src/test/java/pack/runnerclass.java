package pack;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Training_C2a.05.01\\eclipse-workspace\\casestudycucumber\\src\\test\\resources\\test4.feature",
 plugin= {"html:target/reports"})
public class runnerclass {
  
}
