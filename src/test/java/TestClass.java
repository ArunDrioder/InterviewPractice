import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass
{
    @Test

    public void testMethod()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement findElement = driver.findElement(By.xpath("hjgjghjg]"));
        boolean result = findElement.isDisplayed();
        if (result)

            System.out.println("PASS");


        else
            System.out.println("FAIL");



    }
}
