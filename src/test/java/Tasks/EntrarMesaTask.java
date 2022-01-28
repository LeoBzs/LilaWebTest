package Tasks;

import PageObjects.EntrarMesaPage;
import org.openqa.selenium.WebDriver;

public class EntrarMesaTask {
    private final EntrarMesaPage entrarMesaPage;

    public EntrarMesaTask(WebDriver driver) {
        entrarMesaPage = new EntrarMesaPage(driver);
    }

    public void clicaNaSala() throws Exception {
        entrarMesaPage.getBotaoEntrar().click();
    }
}
