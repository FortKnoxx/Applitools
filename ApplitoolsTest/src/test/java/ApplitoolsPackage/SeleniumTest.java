package ApplitoolsPackage;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class SeleniumTest {


    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        Eyes eyes = new Eyes();

        eyes.setApiKey("S7qk94UXDbjHTqHxtVioiphR4OXanxqJgtFBiYQPIfo110");
        eyes.open(driver, "ApplitoolsTest", "VerificationTest", new RectangleSize(1024, 768));
        driver.get("http://www.ah.nl");
        driver.findElement(By.id("accept-cookies")).click();
        eyes.checkWindow("Landing Page");
        eyes.close();

        driver.quit();

        /*
        TakesScreenshot screenshot = (TakesScreenshot)driver;

        driver.manage().window().maximize();
        driver.get("http://www.ah.nl");

        FileHandler.copy(screenshot.getScreenshotAs(OutputType.FILE), new File(".\\src\\test\\resources\\Screenshots\\LandingPage.png"));

        //WebElement element = driver.findElement(By.id("accept-cookies"));
        WebElement popup = driver.findElement(By.id("cookie-popup"));

        FileHandler.copy(popup.getScreenshotAs(OutputType.FILE), new File(".\\src\\test\\resources\\Screenshots\\CookiePopup.png"));

        driver.findElement(By.id("accept-cookies")).click();

        System.out.println(driver.getTitle());

        driver.quit();*/
    }
}