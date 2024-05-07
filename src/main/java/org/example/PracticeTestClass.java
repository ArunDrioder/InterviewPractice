package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeTestClass
{
    public static void main(String[] args) {
        WebDriver driver =  new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //URL launch
        driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
        // identify element with partial link text
        WebElement n =driver.findElement(By.partialLinkText("Refund"));
        //check if element visible
        boolean t = driver.findElement(By.partialLinkText("Refund")).isDisplayed();
        if (t) {
            System.out.println("Element is dispalyed");
        } else {
            System.out.println("Element is not dispalyed");
        }
        driver.quit();
    }
}