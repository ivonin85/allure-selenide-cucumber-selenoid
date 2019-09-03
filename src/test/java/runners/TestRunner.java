package runners;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        format = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
        features = {"src/test/cucumber/test.feature"},
        plugin = {"io.qameta.allure.cucumber2jvm.AllureCucumber2Jvm"},
        glue = {"steps"})

public class TestRunner {
    @BeforeClass
    public static void before() {
        WebDriverManager.chromedriver().version("76").setup();
        Configuration.timeout = 10000;
        /*Configuration.baseUrl = "http://localhost:4444/";
        Configuration.remote = "http://35.158.91.91:4444/wd/hub";
        Configuration.browserSize = "1920x1080";
        Configuration.browserCapabilities.setCapability("enableVNC", true);
        Configuration.browserCapabilities.setCapability("enableVideo", false);*/
    }

}
