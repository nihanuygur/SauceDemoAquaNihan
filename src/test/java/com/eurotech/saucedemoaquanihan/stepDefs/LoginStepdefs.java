package com.eurotech.saucedemoaquanihan.stepDefs;

import com.eurotech.saucedemoaquanihan.pages.LoginPage;
import com.eurotech.saucedemoaquanihan.pages.ProductsPage;
import com.eurotech.saucedemoaquanihan.utilities.ConfigurationReader;
import com.eurotech.saucedemoaquanihan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepdefs {
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage=new ProductsPage();

    @Given("The user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user enters with {string} and {string} and clicks login button")
    public void theUserEntersWithAndAndClicksLoginButton(String username, String password) {

        loginPage.login(username,password);

    }

    @Then("The user should be able to login successfully")
    public void theUserShouldBeAbleToLoginSuccessfully() {
        String expectedHeader="Products";
        String actualHeader= productsPage.spanProducts.getText();
        Assert.assertEquals(expectedHeader,actualHeader);
    }
}
