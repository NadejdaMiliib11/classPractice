package steps;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.sql.SQLOutput;


public class Hooks {
    @Before
    public void setup(){

        System.out.println("This is hooks setup method");
    }
    @Before(order = 1)
    public void setup2(){

    }
   // @Before(value = "@amazon", order = 1)
    public void setup3(){
        System.out.println("this is hooks for amazon");
    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println("hooks clean up");
        System.out.println(scenario.getName());
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

        Driver.quitDriver();
    }
}
