package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class tokopedia {
    public void tokped(){
        System.setProperty("webdriver.chrome.driver",
                "E:\\software\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.tokopedia.com";
        driver.get(baseURL);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@class='css-2hev56']")).click();
//        driver.findElement(By.xpath("//input[@class='css-1wc186l e110g5pc0']")).sendKeys("Lip tin");
    }
}
