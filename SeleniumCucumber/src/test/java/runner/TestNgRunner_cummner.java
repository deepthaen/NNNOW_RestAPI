package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;

import net.masterthought.cucumber.*;
@CucumberOptions(
	features="src/test/resources/features",
	glue= "stepDefinitions"
	//tags= {"@Functional"}
	
)
public class TestNgRunner_cummner extends AbstractTestNGCucumberTests {
	@AfterSuite(alwaysRun=true)
	public void generateHTMLReports() {
		generateCucumberReport();
	}
	@DataProvider(parallel = true)
    public Object[][] scenarios() {
		  return super.features();
    }
	
	 public void generateCucumberReport() {
	        File reportOutputDirectory = new File("target");
	        ArrayList<String> jsonFiles = new ArrayList<String>();
	        jsonFiles.add("target/cucumber.json");

	        String projectName = "Selenium Cucumber reportin";

	        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
	        configuration.addClassifications("Platform", "Windows");
	        configuration.addClassifications("Browser", "Chrome");
	        configuration.addClassifications("Branch", "release/1.0");

	        // optionally add metadata presented on main page via properties file
	        List<String> classificationFiles = new ArrayList<String>();
	        classificationFiles.add("src/test/resources/sit.properties");
	        configuration.addClassificationFiles(classificationFiles);

	        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
	        reportBuilder.generateReports();
	    }
}
