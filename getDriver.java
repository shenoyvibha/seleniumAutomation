import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDriver {
    public  static WebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver","//Users//vibha//Selenium//chromedriver");
        WebDriver webDriver = new ChromeDriver();
        return webDriver;
    }
    public static WebDriver webDriver = getWebDriver();

}
