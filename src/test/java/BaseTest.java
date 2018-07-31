import core.ProjectWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    GoogleLandingPage googleLandingPage;
    String URL = "https://www.google.com/";

    @BeforeMethod
    public void setUp() {
        driver = ProjectWebDriver.createWebDriverInstance();
        googleLandingPage = PageFactory.initElements(driver, GoogleLandingPage.class);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
