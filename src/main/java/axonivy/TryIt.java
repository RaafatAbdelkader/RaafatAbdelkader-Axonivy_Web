package axonivy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TryIt {
    WebDriver driver;
    WebDriverWait wait;

    private By navigateToRegistrationBTN= By.xpath("//a[contains(text(),'Jetzt Test starten')]");

    public RegistrationPage navigateToRegistrationPage() {
        wait.until(ExpectedConditions.elementToBeClickable(navigateToRegistrationBTN));
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(navigateToRegistrationBTN)).build().perform();
        driver.findElement(navigateToRegistrationBTN).click();
        return new RegistrationPage(driver);
    }

    public TryIt(WebDriver driver) {
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getTitle(){
        return driver.getTitle();
    }


}
