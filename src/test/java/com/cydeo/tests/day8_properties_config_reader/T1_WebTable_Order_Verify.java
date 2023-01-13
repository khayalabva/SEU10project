package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }
        //TC #1: Web table practice
        @Test
        public void order_name_verify_test(){

            //Locate the cell that has Bob Martin text in it
            WebElement bobMartinCell = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[7]/td[2]"));

            //2. Verify Bob’s name is listed as expected.
            String expectedBobName = "Bob Martin";
            String actualBobName = bobMartinCell.getText();

            Assert.assertEquals(expectedBobName, actualBobName);
            //Expected: “Bob Martin”

            //Locate the cell that has Bob Martin's order date in it
            WebElement bobOrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));

            //3. Verify Bob Martin’s order date is as expected
            String expectedBobDate = "12/31/2021";
            String actualBobDate = bobOrderDate.getText();
            //Expected: 12/31/2021

            Assert.assertEquals(expectedBobDate,actualBobDate);
        }

        @Test
        public void test2(){
            WebTableUtils.returnOrderDate(driver,"Alexandra Gray" );
        }


}
