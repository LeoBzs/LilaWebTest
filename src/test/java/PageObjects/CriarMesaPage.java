package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CriarMesaPage {
    private final Waits waits;

    public CriarMesaPage(WebDriver driver){
        waits = new Waits(driver);
    }

    public WebElement getNickTextField(){
        return waits.visibilityOfElement(By.xpath("/html/body/app-root/app-criar-mesa/div/div[2]/mat-form-field/div/div[1]/div/input"));
    }
    public WebElement getCriarButton(){
        return waits.visibilityOfElement(By.xpath("/html/body/app-root/app-criar-mesa/div/div[3]/button"));
    }

    public WebElement getMesaImage(){
        return waits.visibilityOfElement(By.className("logo"));
    }
}
