package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    @FindBy(id="phoneInput")
    private WebElement phoneInput;
    @FindBy(id="password")
    private WebElement passwordInput;
    @FindBy(name="buttonLoginSubmit")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'Phone number is required')]")
    public WebElement errorMsgOnPhoneNumberEmpty;

    @FindBy(xpath = "//div[contains(text(),'Password is required')]")
    public WebElement errorMsgOnPassword;

    @FindBy(xpath = "//div[contains(text(),'Mobile provider prefix is not correct.')]")
    public WebElement errorMsgOnPhoneNumberPrefix;


    public LoginPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void fillUpPassword(String login){
        passwordInput.sendKeys(login);
    }

    public void fillUpPhone(String phoneNr){
        this.phoneInput.sendKeys(phoneNr);
    }

    public void pressLoginButton(){
        this.loginButton.click();
    }
    public void goTo(){
        this.driver.get("https://s.gsb.co.zm/authentication/login");
    }
}
