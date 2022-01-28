package Tasks;

import PageObjects.CriarMesaPage;
import Utils.FileOperations;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CriarMesaTask {
    private final CriarMesaPage criarMesaPage;

    public CriarMesaTask(WebDriver driver){
        criarMesaPage = new CriarMesaPage(driver);
    }

    public void realizarLogin() throws Exception{
        String user = FileOperations.getProperties("data").getProperty("user");

        verificaCarregamentoMesa();
        criarMesaPage.getNickTextField().click();
        criarMesaPage.getNickTextField().sendKeys(user);
        criarMesaPage.getCriarButton().click();
    }

    public void verificaCarregamentoMesa(){

            boolean imagemOn = criarMesaPage.getMesaImage().isDisplayed();

            Assertions.assertTrue(imagemOn);
    }
}
