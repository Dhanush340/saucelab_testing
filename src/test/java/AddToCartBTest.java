import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AddToCartBTest extends BaseTests {
    @Test
    public void testAddToCart(){
        loginPage.setUsername("standard_user");;
        loginPage.setPassword("secret_sauce");
        var secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.clickAddToCartButton();
        assertTrue(secureAreaPage.isRemoveButtonDisplayed(), "Remove button is not displayed");

        var cartPage = secureAreaPage.clickShoppingCartButton();
        assertTrue(cartPage.getAlertText()
                        .contains("YOUR CART"),
                "Inventory title is incorrect");
    }
}
