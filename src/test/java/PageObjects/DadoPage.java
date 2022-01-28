package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DadoPage {
    private final Waits waits;

    public DadoPage(WebDriver driver){
        waits = new Waits(driver);
    }

    public WebElement getCartaEspecial(){
        return waits.visibilityOfElement(By.xpath("/html/body/app-root/app-mesa-jogo/div/nav/app-area-de-compra/div/div/div[2]/div[1]/div[2]/div[2]/p"));
    }
    public WebElement getDadoGirar(){
        return waits.visibilityOfElement(By.xpath("/html/body/app-root/app-mesa-jogo/div/nav/app-area-de-compra/div/div/div[1]/div[2]/app-habilita-dado/div/button"));
    }
    public WebElement getDadoResultado(){
        return waits.visibilityOfElement(By.xpath("/html/body/app-root/app-mesa-jogo/div/nav/app-area-de-compra/div/div/div[1]/div[2]/app-habilita-dado/div/ol"));
    }
    public WebElement getResetDado(){
        return waits.visibilityOfElement(By.xpath("/html/body/app-root/app-mesa-jogo/div/nav/app-area-de-compra/div/div/div[1]/div[2]/app-habilita-dado/div/button"));
    }
}
