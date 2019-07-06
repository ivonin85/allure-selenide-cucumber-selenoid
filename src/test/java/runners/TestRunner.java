package runners;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        format = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
        features = {"src/test/cucumber/"},
        plugin = {"io.qameta.allure.cucumber2jvm.AllureCucumber2Jvm"},
        glue = {"steps", "hooks"})

public class TestRunner {
    @BeforeClass
    public static void before() {
        Configuration.baseUrl = "http://localhost:4444/";
        Configuration.remote = "http://18.130.155.109:4444/wd/hub";
        Configuration.timeout = 20000;
        // ChromeDriverManager.getInstance().setup();
        Configuration.browserSize = "1600x1024";
        Configuration.browserCapabilities.setCapability("enableVNC", true);
        Configuration.browserCapabilities.setCapability("enableVideo", false);
    }

}
