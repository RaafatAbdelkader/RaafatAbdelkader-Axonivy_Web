package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class DriverInitial {
    private String browserName= PropReader.getProperty("Browser");
    private  WebDriver driver;

    public WebDriver getDriver (){
        switch (browserName){
            case "edge":
                driver=WebDriverManager.edgedriver().create();
                break;
            case "firefox":
                driver=WebDriverManager.firefoxdriver().create();
                break;
            default:
                driver=WebDriverManager.chromedriver().create();
                break;
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
         return driver;
    }
}
