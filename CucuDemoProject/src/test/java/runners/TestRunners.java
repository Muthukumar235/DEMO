package runners;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import managers.FileReaderManager;
 
//@RunWith(Cucumber.class)
@CucumberOptions(
 //features = "src/test/resources/functionalTests",glue= {"stepDefinitions"},tags= {"@Test4,@Test5,@Test1,@Test2,@Test3"}
 features = "src/test/resources/Features",glue= {"stepDefinitions"},tags= {"@Test1"},plugin= {"pretty"},monochrome=true
 //features = "src/test/resources/Features",glue= {"stepDefinitions"},tags= {"@Test1"},plugin= {"usage"},monochrome=true
 //features = "src/test/resources/Features",glue= {"stepDefinitions"},tags= {"@Test1"},plugin= {"pretty","html:target/cucumber-reports"},monochrome=true
 //features = "src/test/resources/Features",glue= {"stepDefinitions"},tags= {"@Test1"},plugin= {"pretty","json:target/cucumber-reports/Cucumber.json"},monochrome=true
 //features = "src/test/resources/Features",glue= {"stepDefinitions"},tags= {"@Test1"},plugin= {"pretty","junit:target/cucumber-reports/Cucumber.xml"},monochrome=true
 //features = "src/test/resources/Features",glue= {"stepDefinitions"},tags= {"@Test1"},plugin= {"pretty","junit:target/cucumber-reports/Cucumber.xml","json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports"},monochrome=true
 //features = "src/test/resources/Features",glue= {"stepDefinitions"},tags= {"@Test1"},plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},monochrome = true
)

//tags= {"@Test1,@Test2,@Test3"} - This is for OR operations using Tags
//tags={"@Test4","@Test5"} - This is for AND operations using Tags

public class TestRunners extends AbstractTestNGCucumberTests{
//public class TestRunners {
	 /*@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
     Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
     Reporter.setSystemInfo("Selenium", "3.7.0");
     Reporter.setSystemInfo("Maven", "3.5.2");
     Reporter.setSystemInfo("Java Version", "1.8.0_151");
	 }*/
}