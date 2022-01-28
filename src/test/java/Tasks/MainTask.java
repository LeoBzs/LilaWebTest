package Tasks;

import PageObjects.MainPage;
import org.openqa.selenium.WebDriver;

public class MainTask {
    private final MainPage mainPage;

    public MainTask(WebDriver driver) {
        mainPage = new MainPage(driver);
    }

    public void clicaNaSala() throws Exception {
        mainPage.getBotaoSala().click();
    }
}
