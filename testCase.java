import org.testng.annotations.Test;

public class testCase {
    loginPage1 loginPage = new loginPage1();
    String email ="shenoy95vibha@gmail.com";
    String password = "hihello";

    @Test(description = "Click on the login button on the login page, enter the email and password, click on login. ")
    public void login() throws InterruptedException {
        getDriver.webDriver.get("https://web.agentdesks.com/#/login/choice");
        loginPage.clickLoginUsingEmail();
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
        loginPage.clickLoginButton();

    }
}
