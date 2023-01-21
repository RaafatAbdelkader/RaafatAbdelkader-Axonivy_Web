package axonivy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Header {

    WebDriver driver;
    WebDriverWait wait;

    private By languageSwitcher= By.xpath("//div/a[contains(@class,'lang_switcher') and @data-language='en']");
    private  By germanLanguage= By.xpath("//li/a[contains(@class,'lang_switcher') and @data-language='de']");
    private By cookies=By.xpath("//a[@id='hs-eu-confirmation-button']");
    public Header(WebDriver driver) {
        this.driver = driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void acceptCookies(){
        if(driver.findElement(cookies).isDisplayed())
            driver.findElement(cookies).click();
    }

    public void changeToGerman(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(languageSwitcher));
        WebElement element=driver.findElement(languageSwitcher);
        Actions actions =new Actions(driver);
        actions.moveToElement(element).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(germanLanguage));
        driver.findElement(germanLanguage).click();
    }


}
