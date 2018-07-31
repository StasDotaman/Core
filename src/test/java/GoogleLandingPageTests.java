import org.testng.annotations.Test;

public class GoogleLandingPageTests extends BaseTest {

    @Test
    public void findSomething() {
        driver.get(URL);
        driver.navigate().to(URL);
        googleLandingPage.findSomething("Something helpful");
    }
}
