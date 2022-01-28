package Tasks;

import PageObjects.RegrasPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class RegrasTask {
    private final RegrasPage regrasPage;

    public RegrasTask(WebDriver driver) {
        regrasPage = new RegrasPage(driver);
    }

    public void clicaRegras() throws Exception {
        regrasPage.getRegras().click();
        verificaCarregamentoMesa();
        regrasPage.getBotaoSair().click();
    }

    public void verificaCarregamentoMesa(){
        boolean imagemOn = regrasPage.getRegrasValidacao().isDisplayed();
        Assertions.assertTrue(imagemOn);
        System.out.println("Lista de regras validado!");
    }
}
