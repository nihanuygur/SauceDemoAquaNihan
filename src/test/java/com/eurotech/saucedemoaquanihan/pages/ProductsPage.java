package com.eurotech.saucedemoaquanihan.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://www.saucedemo.com/
public class ProductsPage extends BasePage {
    @FindBy(xpath = "//span[contains(@class, 'title')]")
    public WebElement spanProducts;


    
}