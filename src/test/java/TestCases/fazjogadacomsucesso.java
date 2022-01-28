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
    private final DadoTask dadoTask = new DadoTask(driver);
    private final CartasIndisponiveisTask cartasIndisponiveisTask = new CartasIndisponiveisTask(driver);

    @Test
    public void CaseGuiasComSucesso(){
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
    @Test
    public void CaseDadosComSucesso(){
        try{
            mainTask.clicaNaSala();
            criarMesaTask.realizarLogin();
            entrarMesaTask.clicaNaSala();
            dadoTask.jogarDado();
            System.out.println("sucesso");
        }catch (Exception e) {
            System.out.println("Erro");
        }
    }

    @Test
    public void HoverParaCartaIndisponivel(){
        try{
            mainTask.clicaNaSala();
            criarMesaTask.realizarLogin();
            entrarMesaTask.clicaNaSala();
            cartasIndisponiveisTask.hover();
            System.out.println("sucesso");
        }catch (Exception e) {
            System.out.println("Erro");
        }
    }
}