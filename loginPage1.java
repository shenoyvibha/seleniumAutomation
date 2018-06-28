import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class loginPage1 {
    //Methods to return elements
    public WebElement loginUsingEmail() {
        WebElement loginButton = getDriver.webDriver.findElement(By.className("btn-email"));
        return loginButton;
    }

    public WebElement getEmailField() throws InterruptedException {
        Thread.sleep(2000);
        WebElement emailField = getDriver.webDriver.findElement(By.id("email123"));
        return emailField;
    }

    public WebElement getPasswordField() {
        WebElement passwordField = getDriver.webDriver.findElement(By.id("exampleInputPassword1"));
        return passwordField;
    }

    public WebElement getLoginButton() {
        WebElement loginButton = getDriver.webDriver.findElement(By.name("home_form"));
        return loginButton;
    }
    // methods to perform actions on the elements
    public void clickLoginUsingEmail() throws InterruptedException {
        Thread.sleep(3000);
        loginUsingEmail().click();
    }

    public void setEmailField(String username) throws InterruptedException {
        getEmailField().sendKeys(username);
    }

    public void setPasswordField(String password) {
        getPasswordField().sendKeys(password);
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }


}
