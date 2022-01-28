package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegrasPage {
    private final Waits waits;

    public RegrasPage(WebDriver driver){
        waits = new Waits(driver);
    }

    public WebElement getRegras(){
        return waits.visibilityOfElement(By.xpath("/html/body/app-root/app-mesa-jogo/div[1]/div/app-regras-jogo/div/button"));
    }
    public WebElement getRegrasValidacao(){
        return waits.visibilityOfElement(By.xpath("/html/body/jw-modal[2]/div[1]/div/div/div/div[2]/div[1]"));
    }
    public WebElement getBotaoSair(){
        return waits.visibilityOfElement(By.xpath("/html/body/jw-modal[2]/div[1]/div/div/div/button"));
    }
}
