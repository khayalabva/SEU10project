package com.cydeo.tests.day02_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) {
     //   TC #4: Library verifications
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

     //   1. Open Chrome browser
     //   2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");


        //   3. Enter username: “incorrect@email.com”
        WebElement userNameInput  =driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");


     //   4. Enter password: “incorrect password”
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");


    // Click to sign in
    WebElement singInButton = driver.findElement(By.tagName("button"));
    singInButton.click();



     /*  6. Verify: visually “Sorry, Wrong Email or Password” displayed
        PS: Locate username input box using “className” locator
        Locate password input box using “id” locator
        Locate Sign in button using “tagName” locator

      */

    }
}
