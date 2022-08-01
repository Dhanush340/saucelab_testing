package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryAreaPage {

    private WebDriver driver;
    private By statusAlert = By.cssSelector(".title");
    private By clickAddToCartButton = By.id("add-to-cart-sauce-labs-backpack");//remove-sauce-labs-backpack
    private By removeButton = By.id("remove-sauce-labs-backpack");//shopping_cart_container
    private By shoppingCart = By.cssSelector(".shopping_cart_link");

    public InventoryAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }

    public InventoryAreaPage clickAddToCartButton(){
        driver.findElement(clickAddToCartButton).click();
        return new InventoryAreaPage(driver);
    }
    public boolean isRemoveButtonDisplayed(){
        return driver.findElement(removeButton).isDisplayed();
    }

    public YourCartPage clickShoppingCartButton(){
        driver.findElement(shoppingCart).click();
        return new YourCartPage(driver);
    }
}
