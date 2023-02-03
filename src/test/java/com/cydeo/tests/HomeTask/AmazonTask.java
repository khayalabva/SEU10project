package com.cydeo.tests.HomeTask;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AmazonTask {

    @Test
    public void amazonTask(){
        Driver.getDriver().get("https://www.amazon.com.tr/");

        WebElement acceptButton = Driver.getDriver().findElement(By.xpath("//input[@id='sp-cc-accept']"));
        acceptButton.click();

        WebElement searchPart = Driver.getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchPart.sendKeys("iPhone13 512");

        WebElement searchBottom = Driver.getDriver().findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchBottom.click();

        WebElement firstResult = Driver.getDriver().findElement(By.xpath("//img[@class='s-image']"));
        firstResult.click();




    }


}
