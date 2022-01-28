package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuiaRapidoPage {
    private final Waits waits;

    public GuiaRapidoPage(WebDriver driver){
        waits = new Waits(driver);
    }

    public WebElement getGuiaRapido(){
        return waits.visibilityOfElement(By.xpath("/html/body/app-root/app-mesa-jogo/div[1]/div/app-guia-rapido/div/button"));
    }
    public WebElement getGuiaValidacao(){
        return waits.visibilityOfElement(By.xpath("/html/body/jw-modal[1]/div[1]/div/div/h1"));
    }
}
