package Tasks;

import PageObjects.DadoPage;
import PageObjects.RegrasPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class DadoTask {
    private final DadoPage dadoPage;

    public DadoTask(WebDriver driver) {
        dadoPage = new DadoPage(driver);
    }

    public void jogarDado() throws Exception {
        dadoPage.getCartaEspecial().click();
        dadoPage.getDadoGirar().click();
        verificaCarregamentoMesa();
        dadoPage.getResetDado();
    }

    public void verificaCarregamentoMesa(){
        boolean imagemOn = dadoPage.getDadoResultado().isDisplayed();
        Assertions.assertTrue(imagemOn);
        System.out.println("Resultado do dado validado!");
    }
}
