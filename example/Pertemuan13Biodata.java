package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Pertemuan13Biodata {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "E:\\software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Estu");
        Thread.sleep( 1000);
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Renatalia");
        Thread.sleep( 1000);
        driver.findElement(By.xpath("//input[@id='job-title']")).sendKeys("Marketing");
        Thread.sleep( 1000);
        driver.findElement(By.xpath("//input[@id='radio-button-1']")).click();
        Thread.sleep( 1000);
        driver.findElement(By.xpath("//input[@id='radio-button-2']")).click();
        Thread.sleep( 1000);
        driver.findElement(By.xpath("//input[@id='radio-button-3']")).click();
        Thread.sleep( 1000);
//        driver.findElement(By.xpath("//input[@id='checkbox-1']")).click();
//        Thread.sleep( 1000);
        driver.findElement(By.xpath("//input[@id='checkbox-2']")).click();
        Thread.sleep( 1000);
//        driver.findElement(By.xpath("//input[@id='checkbox-3']")).click();
//        Thread.sleep( 1000);
        Select experience = new Select(driver.findElement(By.id("select-menu")));
        experience.selectByValue("1");
        WebElement date = driver.findElement(By.id("datepicker"));
        date.click();
        Thread.sleep(1000);
        List<WebElement> dates = driver.findElements(By.className("day"));

        int count = driver.findElements(By.className("day")).size();

        for (int i=0; i<count;i++){
            String text = driver.findElements(By.className("day")).get(i).getText();
            if (text.equalsIgnoreCase("11")){
                driver.findElements(By.className("day")).get(i).click();
                break;
            }
        }
        Thread.sleep(1000);
        WebElement submit = driver.findElement(By.xpath("//a[@role='button']"));
        submit.click();

    }
}

