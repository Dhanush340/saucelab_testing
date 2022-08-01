import base.BaseTests;
import org.testng.annotations.Test;
import pages.InventoryAreaPage;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        InventoryAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText()
                        .contains("PRODUCTS"),
                "Inventory title is incorrect");
    }
}
