package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        //1- Set up the browser driver
        WebDriverManager.chromiumdriver().setup();

        //2- Create instance of thr Selenium WebDriver
        // This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //This Line will maximize the browser size
        driver.manage().window().maximize();

        //Same function as maximize, but sometimes doesn't work for Windows
        //driver.manage().window().fullscreen();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        //get the URL from Selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //Use selenium to navigate back
        driver.navigate().back();

        Thread.sleep(3000);

        // use selenium yo navigate foreword
        driver.navigate().forward();

        //Use selenium to refresh
        driver.navigate().refresh();

        //use navigate().to();
        driver.navigate().to("https://www.google.com");

        //get the title of the page, returns String
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        //Will close only the currently opened browser
        driver.close();

        //Will kills thr current session
        driver.quit();









        }



    }

