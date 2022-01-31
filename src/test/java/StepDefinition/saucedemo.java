package StepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
public class saucedemo {
    Object_Repository or=new Object_Repository(Hook.driver);
    String ActualItem_Name;
    String ActualItem_Name_1;
    @Given("Navigate to the site URL")
    public void navigateToTheSiteURL() throws IOException, InterruptedException {
        Hook.get_URL();
    }


    @And("The user clicks on the login button")
    public void theUserClicksOnTheLoginButton() {
        or.LoginButton.click();
    }

    @Given("The user enters the username as {string} and password as {string}")
    public void theUserEntersTheUsernameAsAndPasswordAs(String arg0, String arg1) {
        or.UserNameTextBox.sendKeys(arg0);
        or.PasswordTextBox.sendKeys(arg1);
    }

    @When("The user clicks on the product sort container")
    public void theUserClicksOnTheProductSortContainer() {
        or.ProductSortContainer_Dropdown.click();
    }

    @And("Select the sort option as {string}")
    public void selectTheSortOptionAs(String arg0) {
        Select s=new Select(or.ProductSortContainer_Dropdown);
        s.selectByVisibleText(arg0);
    }


    @And("Select the inventory item name as Sauce Labs Onesie")
    public void selectTheInventoryItemNameAsSauceLabsOnesie() {
        ActualItem_Name=or.Inventory_Name.getText();
        System.out.println(ActualItem_Name);
        or.Inventory_Name.click();
    }

    @When("The user clicks on the Add to cart button")
    public void theUserClicksOnTheAddToCartButton() {
        or.Inventory_Name_ATC.click();
    }

    @And("The user navigates to the shopping cart link")
    public void theUserNavigatesToTheShoppingCartLink() {
        or.Shopping_Cart_Link.click();
        String ExpectedCartPageTitle=or.Shopping_Cart_PageTitle.getText();
        String ActualCartPageTitle=Hook.prop.getProperty("ExpectedCartPageTitle");
        try{
            Assert.assertEquals(ExpectedCartPageTitle,ActualCartPageTitle);
            System.out.println("Assertion Passed");
        }
        catch (AssertionError e){
            e.printStackTrace();
        }
    }

    @Then("Validate the item name in the cart")
    public void validateTheItemNameInTheCart() {
        String ExpectedFirstItemName=Hook.prop.getProperty("Item_Name_1");
        String ExpectedSecondItemName=Hook.prop.getProperty("Item_Name_2");
        try{
            Assert.assertEquals(ExpectedFirstItemName,ActualItem_Name);
            Assert.assertEquals(ExpectedSecondItemName,ActualItem_Name_1);
            System.out.println("The correct items are added to the cart");
        }
        catch (AssertionError e){
            e.printStackTrace();
        }
    }



    @Then("Logout of the application")
    public void logoutOfTheApplication() {
        or.Menu_Button.click();
        WebDriverWait wait=new WebDriverWait(Hook.driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
        or.LogOut_Button.click();
    }

    @And("Select the inventory item name as Sauce Labs Fleece Jacket")
    public void selectTheInventoryItemNameAsSauceLabsFleeceJacket() {
        ActualItem_Name_1=or.Inventory_Name_2.getText();
        System.out.println(ActualItem_Name_1);
        or.Inventory_Name_2.click();
    }

    @Then("Navigate to the one page backwards")
    public void navigateToTheOnePageBackwards() {
        Hook.driver.navigate().back();
    }

    @When("The user clicks on the Add to cart button for fleece jacket")
    public void theUserClicksOnTheAddToCartButtonForFleeceJacket() {
        or.Inventory_Name_2_ATC.click();
    }

    @Then("Click on the check out button")
    public void clickOnTheCheckOutButton() {
        or.CheckOut_Button.click();
    }

    @And("Fill the relevant details")
    public void fillTheRelevantDetails() {
        or.First_Name.sendKeys(Hook.prop.getProperty("First_Name"));
        or.Last_Name.sendKeys(Hook.prop.getProperty("Last_Name"));
        or.Postal_Code.sendKeys(Hook.prop.getProperty("Postal_Code"));
    }

    @Then("Click on the Continue Button")
    public void clickOnTheContinueButton() {
        or.Continue_Button.click();
    }

    @Then("Click on the finish button")
    public void clickOnTheFinishButton() {
        or.Finish_Button.click();
    }

    @And("Validate the order confirmation")
    public void validateTheOrderConfirmation() {
        String ExpectedTitle=Hook.prop.getProperty("Expected_Title");
        String ActualTitle=or.ActualTitle.getText();
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        System.out.println("The order is successful");
    }
}
