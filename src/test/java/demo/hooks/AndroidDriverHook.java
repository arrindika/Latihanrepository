package demo.hooks;

import demo.webdrivers.AndroidDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AndroidDriverHook {
    @Before(value = "@Android")
    public void initializeAndroid(){
        AndroidDriverInstance.initializeDriver();
    }

    @After(value = "@Android")
    public void quitAndroid(Scenario scenario){
        if (scenario.isFailed()) {
            scenario
                    .embed(((TakesScreenshot) AndroidDriverInstance.androidDriver)
                                    .getScreenshotAs(OutputType.BYTES),
                            "image/png");
            scenario.write("Scenario Fail");
        }
        AndroidDriverInstance.quitDriver();
    }
}
