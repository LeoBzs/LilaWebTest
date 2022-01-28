package Tasks;

import PageObjects.EntrarMesaPage;
import PageObjects.GuiaRapidoPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class GuiaRapidoTask {
    private final GuiaRapidoPage guiaRapidoPage;

    public GuiaRapidoTask(WebDriver driver) {
        guiaRapidoPage = new GuiaRapidoPage(driver);
    }

    public void clicaNoGuia() throws Exception {
        guiaRapidoPage.getGuiaRapido().click();
        verificaCarregamentoMesa();
    }

    public void verificaCarregamentoMesa(){
        boolean imagemOn = guiaRapidoPage.getGuiaValidacao().isDisplayed();
        Assertions.assertTrue(imagemOn);
        System.out.println("Guia validado!");
    }
}
