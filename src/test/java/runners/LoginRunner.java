package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "steps",
//		tags = "@TF_login2, @Other_Login1",
//		tags = "@smoke",
//		tags = "@TF_login1",
//		tags = "@Login_Test_Regression",
		tags = "@TF_login2",
		monochrome = true,
		dryRun = false,
		plugin = {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
		}
		)
public class LoginRunner {

}
