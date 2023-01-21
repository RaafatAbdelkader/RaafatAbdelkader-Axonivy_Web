package axonivy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    private By tryIt= By.xpath("//a[@title='Try it Now']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public TryIt navigateToTryItNow(){
        driver.findElement(tryIt).click();
      return new TryIt(driver);
    }



}
