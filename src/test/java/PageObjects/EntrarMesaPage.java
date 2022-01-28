package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntrarMesaPage {
    private final Waits waits;

    public EntrarMesaPage(WebDriver driver){
        waits = new Waits(driver);
    }

    public WebElement getBotaoEntrar(){
        return waits.visibilityOfElement(By.xpath("/html/body/app-root/app-mesa-criada/div/div[3]/button"));
    }
}
