package Tasks;

import PageObjects.CartasIndisponiveisPage;
import org.openqa.selenium.WebDriver;

public class CartasIndisponiveisTask {
    private final CartasIndisponiveisPage cartasIndisponiveisPage;

    public CartasIndisponiveisTask(WebDriver driver) {
        cartasIndisponiveisPage = new CartasIndisponiveisPage(driver);
    }

    public void hover() throws Exception {
        cartasIndisponiveisPage.getClick();
        cartasIndisponiveisPage.getClick();
        cartasIndisponiveisPage.getCartaIndisponivel();
    }
}
