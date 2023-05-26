package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\MyTools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Open Browser");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        System.out.println("Enter URL Radio Button");
        System.out.println(driver.getTitle());

        delay(1); // 1 detik
        //Web Scraping
        String titlePage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText();
        System.out.println("Title Page: "+titlePage);

        driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
        System.out.println("Radio Button Yes Clicked");
        String message = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span")).getText();
        // Like Assert use IF Else
        if (message.equals("Yes")){
            System.out.println("Test Result: Passed");
        } else {
            System.out.println("Test Result: Failed");
        }

        driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();
        System.out.println("Radio Button Impresive Clicked");
//        driver.findElement(By.linkText("Gmail")).click();

        delay(3); // 3 detik
        driver.quit();
        System.out.println("Close Browser");
    }

    static void delay(long detik){
        try {
            Thread.sleep(detik*1000); // delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
