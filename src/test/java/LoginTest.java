import Pages.LoginPage;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends TestBaseClassFront {
    //LoginPage loginPage;

    @Test
    public void checkIfLoginWithEmptyPhoneNumberIsNotPossible(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.goTo();
        loginPage.fillUpPassword("ItsConfidentalData-InNormalProjectIWouldGetItFromSysEnvs");
        loginPage.pressLoginButton();
        softly.assertThat(loginPage.errorMsgOnPhoneNumberEmpty.isDisplayed());
        softly.assertAll();
    }

    @Test
    public void checkIfLoginWithEmptyPasswordIsNotPossible(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.goTo();
        loginPage.fillUpPhone("211 378200");
        loginPage.pressLoginButton();
        softly.assertThat(loginPage.errorMsgOnPassword.isDisplayed());
        softly.assertAll();
    }

    @Test
    public void checkIfLoginWithEmptyPasswordAndEmptyPhoneNumberIsNotPossible(){
        LoginPage loginPage = new LoginPage(driver.get());
        loginPage.goTo();
        loginPage.pressLoginButton();
        softly.assertThat(loginPage.errorMsgOnPassword.isDisplayed());
        softly.assertThat(loginPage.errorMsgOnPhoneNumberEmpty.isDisplayed());
        softly.assertAll();
    }

    @Test
    public void checkIfLoginWithEmptyPasswordAndRandomPhoneNumberIsNotPossible(){
        LoginPage loginPage = new LoginPage(driver.get());
        loginPage.goTo();
        loginPage.fillUpPhone("345345");
        loginPage.pressLoginButton();
        softly.assertThat(loginPage.errorMsgOnPassword.isDisplayed());
        softly.assertThat(loginPage.errorMsgOnPhoneNumberPrefix.isDisplayed());
        softly.assertAll();
    }

    @Test
    public void checkIfLoginWorksCorrectly(){
        LoginPage loginPage = new LoginPage(driver.get());
        loginPage.goTo();
        loginPage.fillUpPassword("WorkingPassword");
        loginPage.fillUpPhone("712 345 678");
        loginPage.pressLoginButton();
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        softly.assertThat(isElementPresent(loginPage.errorMsgOnPhoneNumberPrefix)).isEqualTo(false);
        softly.assertThat(isElementPresent(loginPage.errorMsgOnPassword)).isEqualTo(false);
        softly.assertThat(isElementPresent(loginPage.errorMsgOnPhoneNumberEmpty)).isEqualTo(false);
        softly.assertAll();
    }

}
