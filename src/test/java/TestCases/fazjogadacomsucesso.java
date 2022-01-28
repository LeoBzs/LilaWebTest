package TestCases;

import Base.TestBase;
import Tasks.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class fazjogadacomsucesso extends TestBase {

    private final WebDriver driver = getDriver();
    private final MainTask mainTask = new MainTask(driver);
    private final CriarMesaTask criarMesaTask = new CriarMesaTask(driver);
    private final EntrarMesaTask entrarMesaTask = new EntrarMesaTask(driver);
    private final GuiaRapidoTask guiaRapidoTask = new GuiaRapidoTask(driver);
    private final RegrasTask regrasTask = new RegrasTask(driver);

    @Test
    public void ClicarSalaComSucesso(){
        try{
            mainTask.clicaNaSala();
            criarMesaTask.realizarLogin();
            entrarMesaTask.clicaNaSala();
            guiaRapidoTask.clicaNoGuia();
            regrasTask.clicaRegras();
            System.out.println("sucesso");
        }catch (Exception e) {
            System.out.println("Erro");
        }
    }
}