package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

//import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

@Test
public class Posttes11 {
    public void PostTes11() {
        System.setProperty("webdriver.chrome.driver",
                "E:\\software\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.tokopedia.com";
        driver.get(baseURL);
        boolean state = true;
        driver.findElement(By.xpath("//input[@class='css-1wc186l e110g5pc0']")).sendKeys("Lip tin", Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        int hargaTampung = 0;
        while (state) {
            try {
                List<WebElement> elements = driver.findElements(By.cssSelector("div[data-testid=\"spnSRPProdPrice\"]"));
                for (WebElement harga : elements) {
                    hargaTampung = Integer.parseInt(harga.getText().replaceAll("\\D+", ""));
                    System.out.println(hargaTampung);
                }
                state = false;
            } catch (Exception e) {
                state = true;
            }
        }
        assertTrue(hargaTampung > 0);
        driver.quit();
    }
}