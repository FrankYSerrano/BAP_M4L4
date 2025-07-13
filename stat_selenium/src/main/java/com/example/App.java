package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
    public static void main(String[] args) {
        // Automatically download and setup geckodriver
        WebDriverManager.firefoxdriver().setup();

        // Launch Firefox
        WebDriver driver = new FirefoxDriver();

        // Navigate to a website
        driver.get("https://www.google.com");

        // Optional: wait 5 seconds and close
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
