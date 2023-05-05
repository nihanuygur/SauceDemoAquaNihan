package com.eurotech.saucedemoaquanihan.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://demoqa.com/slider
public class DemoqaSliderPage extends BasePage {
    @FindBy(xpath = "//*[@id='sliderValue']")
    public WebElement inputSliderValue;

    @FindBy(xpath = "//input[@class='range-slider range-slider--primary']")
    public WebElement inputRangeSlider;

    

}