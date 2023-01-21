package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
    static ExtentSparkReporter reporter;
    static ExtentReports reports;

    public  static ExtentReports config(){
        String path= System.getProperty("user.dir")+"//reports//index.html";

        reporter= new ExtentSparkReporter(path);
        reporter.config().setReportName("UI report");

        reports= new ExtentReports();
        reports.attachReporter(reporter);

        reports.setSystemInfo("Browser",PropReader.getProperty("Browser"));

        return reports;
    }
}
