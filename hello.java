package com.internshala.javaapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class hello {
    public static void main(String[] args) {
        System.setProperty("Web driver.chrome.driver","C:\\Users\\shrut\\Downloads\\chrome-win64.zip");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.quit();

    }
}
