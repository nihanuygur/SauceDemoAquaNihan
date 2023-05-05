package com.eurotech.saucedemoaquanihan.pages;

import com.eurotech.saucedemoaquanihan.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
}
