import Models.AbstractTest;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

import static io.restassured.RestAssured.given;

public class TestBaseClassFront {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public SoftAssertions softly;


    @BeforeMethod
    public void beforeWholeScope(){
        driver.set(new ChromeDriver());
        softly = new SoftAssertions();
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void tearDown(){
        driver.get().close();
    }

    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}
