package StepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class Object_Repository {
    WebDriver driver;

    public Object_Repository(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //********************UserName Text Box*************
    @FindBy(how= How.ID,using="user-name")
    public WebElement UserNameTextBox;

    //********************Password Text Box*************
    @FindBy(how=How.ID,using="password")
    public WebElement PasswordTextBox;

    //********************Login button******************
    @FindBy(how=How.ID,using="login-button")
    public WebElement LoginButton;

    //********************Product Sort Container Drop Down****************
    @FindBy(how=How.XPATH,using="//*[@class='product_sort_container']")
    public WebElement ProductSortContainer_Dropdown;

    //********************Inventory Name*********************
    @FindBy(how=How.XPATH,using="//div[@class='inventory_item_name'][contains(text(),'Sauce Labs Onesie')]")
    public WebElement Inventory_Name;
    //********************Inventory Name second*********************
    @FindBy(how=How.XPATH,using="//div[@class='inventory_item_name'][contains(text(),'Sauce Labs Fleece Jacket')]")
    public WebElement Inventory_Name_2;

    //********************Inventory Name Add To Cart*********************
    @FindBy(how=How.ID,using="add-to-cart-sauce-labs-onesie")
    public WebElement Inventory_Name_ATC;
    //********************Inventory Name second Add To Cart*********************
    @FindBy(how=How.ID,using="add-to-cart-sauce-labs-fleece-jacket")
    public WebElement Inventory_Name_2_ATC;
    //********************Shopping Cart Link*********************
    @FindBy(how=How.XPATH,using="//span[@class='shopping_cart_badge']")
    public WebElement Shopping_Cart_Link;

    //********************Shopping Cart Page Title*********************
    @FindBy(how=How.XPATH,using="//span[@class='title']")
    public WebElement Shopping_Cart_PageTitle;

    //********************Remove Button*********************
    @FindBy(how=How.XPATH,using="//*[@class='btn btn_secondary btn_small cart_button'][contains(text(),'Remove')]")
    public WebElement Remove_Button;

    //********************Menu Button*********************
    @FindBy(how=How.ID,using="react-burger-menu-btn")
    public WebElement Menu_Button;

    //********************LogOut Button*********************
    @FindBy(how=How.ID,using="logout_sidebar_link")
    public WebElement LogOut_Button;

    //********************Check out button*****************
    @FindBy(how=How.ID,using="checkout")
    public WebElement CheckOut_Button;
    //********************First Name*****************
    @FindBy(how=How.ID,using="first-name")
    public WebElement First_Name;
    //********************Last Name*****************
    @FindBy(how=How.ID,using="last-name")
    public WebElement Last_Name;
    //********************Postal Code*****************
    @FindBy(how=How.ID,using="postal-code")
    public WebElement Postal_Code;
    //********************Continue Button*****************
    @FindBy(how=How.ID,using="continue")
    public WebElement Continue_Button;
    //********************Finish Button*****************
    @FindBy(how=How.ID,using="finish")
    public WebElement Finish_Button;
    //********************Order Confirmation Title*****************
    @FindBy(how=How.XPATH,using="//*[@id=\"checkout_complete_container\"]/h2")
    public WebElement ActualTitle;
}
