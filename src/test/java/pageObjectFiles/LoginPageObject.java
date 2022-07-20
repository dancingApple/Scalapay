package pageObjectFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.SuperClass;

public class LoginPageObject extends SuperClass {
    private final By emailInputBox = By.id("email");
    private final By pwInputBox = By.id("password");
    private final By loginTriggerBtn = By.xpath("//button[@type='submit']");

    public LoginPageObject(WebDriver driver){
        this.driver = driver;
    }

    public void inputUserName(String username) throws InterruptedException {
        inputValueInElement(emailInputBox, username);
    }

    public void inputPassword(String password) throws InterruptedException {
        inputValueInElement(pwInputBox, password);
    }

    public void clickLoginBtn() throws InterruptedException {
        clickElement(loginTriggerBtn);
        shortWait();
    }
}
