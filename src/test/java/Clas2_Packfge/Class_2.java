package Clas2_Packfge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static Main.TesyNg.driver;

public class Class_2 {


//    @Parameters({"CurrenciesTokens_Pg_Url", "Assert_Test_1"})
    @Test(testName = "Test_1 Footer - Currencies and Tokens link")
    public void case_1() throws InterruptedException, IOException, UnsupportedFlavorException {

        System.out.println(" *** Lesson 5 ***");

        driver.navigate().to("https://rozetka.com.ua/apple-mnwd3ua-a/p364910619/");

        WebElement element = driver.findElement(By.xpath("//*[@class=\"mode-slim toOrder ng-star-inserted\"]"));
        boolean elementIsDisplayed = element.isDisplayed();

        Assert.assertTrue(elementIsDisplayed);


    }
}
