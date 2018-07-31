import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleLandingPage extends BasePage {

    @FindBy(xpath = ".//*[@id='lst-ib']")
    WebElement findBar;

    @FindBy(xpath = "//input[@value='Поиск в Google']")
    WebElement findButton;

    public GoogleLandingPage(WebDriver driver) {
        super(driver);
    }

    public void findSomething(String searchQuery) {
        findBar.sendKeys(searchQuery);
        findButton.click();
    }
}
