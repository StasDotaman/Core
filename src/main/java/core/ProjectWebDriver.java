package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static core.Constants.CHROME_DRIVER_PATH;

public class ProjectWebDriver {

    private static ThreadLocal<WebDriver> driver = ThreadLocal.withInitial(() -> {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        return new ChromeDriver();
    });

    public WebDriver getDriver() {
        return driver.get();
    }

    static WebDriver createChromeDriver() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        return new ChromeDriver();
    }


    public static WebDriver createWebDriverInstance() {
        driver.set(createChromeDriver());
        driver.get().manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        return driver.get();
    }
}