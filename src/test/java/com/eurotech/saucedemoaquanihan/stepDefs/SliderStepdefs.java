package com.eurotech.saucedemoaquanihan.stepDefs;

import com.eurotech.saucedemoaquanihan.pages.DemoqaSliderPage;
import com.eurotech.saucedemoaquanihan.utilities.BrowserUtils;
import com.eurotech.saucedemoaquanihan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SliderStepdefs {
    DemoqaSliderPage demoqaSliderPage = new DemoqaSliderPage();

    @Given("The user is on the slider page")
    public void the_user_is_on_the_slider_page() {
        Driver.get().get("https://demoqa.com/slider");

    }
    @When("The user moves the slider to {int}")
    public void the_user_moves_the_slider_to(Integer targetSliderRange) {


        System.out.println("range = " + demoqaSliderPage.inputRangeSlider.getAttribute("value"));
        int start= Integer.parseInt(demoqaSliderPage.inputSliderValue.getAttribute("value"));

        for (int i=0;i<targetSliderRange-start;i++){
            demoqaSliderPage.inputRangeSlider.sendKeys(Keys.ARROW_RIGHT);
        }

//        Actions move = new Actions (Driver.get());
//        move.dragAndDropBy(demoqaSliderPage.inputRangeSlider, targetSliderRange-start, 0).perform();

        System.out.println("range = " + demoqaSliderPage.inputRangeSlider.getAttribute("value"));
    }

    @Then("The slider should be ranged at {int}")
    public void the_slider_should_be_ranged_at(Integer expectedSliderRange) {


        Assert.assertEquals(expectedSliderRange.toString(),demoqaSliderPage.inputRangeSlider.getAttribute("value"));

    }

}
