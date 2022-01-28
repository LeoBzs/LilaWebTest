package Framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    protected static WebDriver driver;

    private static WebDriver getManagerDriver(TypeDriver type){
        switch (type){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                break;

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                break;

            case HEADLESS:
                WebDriverManager.chromedriver().setup();
                ChromeOptions headless = new ChromeOptions();
                headless.addArguments("--headless");
                headless.addArguments("--window-size(1360,768)");
                driver = new ChromeDriver(headless);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                break;

            case IE:
                WebDriverManager.iedriver().setup();
                MutableCapabilities capabilities = new MutableCapabilities();
                capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.IE);
                capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                driver = new InternetExplorerDriver();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                break;

            default:
                break;
        }

        return driver;
    }

    public static WebDriver getDriver(TypeDriver type){
        if(driver == null){
            driver = getManagerDriver(type);
        }

        return driver;
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
