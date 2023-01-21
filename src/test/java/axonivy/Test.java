package axonivy;

import Base.JsonReader;
import Base.PropReader;

import testBase.Testbase;

import java.util.Map;

public class Test extends Testbase {
    String url= PropReader.getProperty("URL");
    Map<String,String> userData= JsonReader.getUserData("user_2");
    HomePage homePage;
    TryIt tryIt;


    @org.testng.annotations.Test
    public void tryItNow1(){
        driver.get(url);
        homePage= new HomePage(driver);
        header.acceptCookies();
        tryIt= homePage.navigateToTryItNow();
        header.changeToGerman();
        tryIt.navigateToRegistrationPage();
    }
}
