package axonivy;

import Base.PropReader;
import testBase.Testbase;

public class Test2 extends Testbase {
    String url= PropReader.getProperty("URL");
    HomePage homePage;
    TryIt tryIt;


    @org.testng.annotations.Test
    public void tryItNow(){
        driver.get(url);
        homePage= new HomePage(driver);
        tryIt= homePage.navigateToTryItNow();
        System.out.println(tryIt.getTitle());
    }

    @org.testng.annotations.Test
    public void tryItNow2(){
        driver.get(url);
        homePage= new HomePage(driver);
        tryIt= homePage.navigateToTryItNow();
        System.out.println(tryIt.getTitle());
    }

    @org.testng.annotations.Test
    public void tryItNow3(){
        driver.get(url);
        homePage= new HomePage(driver);
        tryIt= homePage.navigateToTryItNow();
        System.out.println(tryIt.getTitle());
    }
}
