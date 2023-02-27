package Main;

import Clas2_Packfge.Class_2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static java.time.Duration.ofSeconds;
public class TesyNg {

    // Инициализируем Webdriver при помощи метода public Static, для автоматического использования в других классах
    public static WebDriver driver;

    @BeforeMethod
    @Parameters({"preferredBrowser"})
    public void setUp(String preferredBrowser) {

        if (preferredBrowser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(ofSeconds(10));

        } else if (preferredBrowser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        }
    }

    @Parameters({"url"})
    @Test(testName = "test1")
    public  void case_1(String url) throws IOException, InterruptedException, UnsupportedFlavorException {
        // Разворачивание страницы
        driver.manage().window().maximize();

        driver.get("https://rozetka.ua");

        WebElement input = driver.findElement(By.xpath
                ("//input[@class=\"search-form__input ng-untouched ng-pristine ng-valid\"]"));

        String currentUrl = driver.getCurrentUrl();

        Assert.assertEquals(currentUrl, url, "Current url wrong");
//        driver.quit();


//        Class_2 class_2 = new Class_2();
//        class_2.case_1("https://rozetka.com.ua/apple-mnwd3ua-a/p364910619/");
    }


}

