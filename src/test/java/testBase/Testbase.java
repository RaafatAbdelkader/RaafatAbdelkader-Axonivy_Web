package testBase;

import Base.DriverInitial;
import axonivy.Header;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Testbase {

    private DriverInitial driverInitial;
    public WebDriver driver;
    public Header header;

    @BeforeClass
    public void before(){
        driverInitial = new DriverInitial();
        driver= driverInitial.getDriver();
        header=new Header(driver);

    }

    @AfterClass
    public void after(){
      // driver.quit();
    }



}
