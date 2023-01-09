package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {
       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

       // 3- Enter incorrect username: “incorrect”
        WebElement userNameInput = driver.findElement(By.className("login-inp"));
        userNameInput.sendKeys("incorrect");

       //  4- Enter incorrect password: “incorrect”
        WebElement passwordInput = driver.findElement(By.name("USER_PASSWORD"));
        passwordInput.sendKeys("incorrect");

       // 5- Click to login button.
        driver.findElement(By.className("login-btn")).click();

       // 6- Verify error message text is as expected:
       // Expected: Incorrect login or password
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = driver.findElement(By.className("errortext")).getText();

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Verification Passed!");
        }else {
            System.out.println("Verification Failed");
        }
        //To auto generate local variable
        //Mac: option + enter
        //Windows: alt + enter

    }
}
/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
PS:
 */
