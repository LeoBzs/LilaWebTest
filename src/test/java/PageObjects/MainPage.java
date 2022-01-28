package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private final Waits waits;

    public MainPage(WebDriver driver){
        waits = new Waits(driver);
    }

    public WebElement getBotaoSala(){
        return waits.visibilityOfElement(By.xpath("/html/body/app-root/app-home-page/div/div[3]/button"));
    }
}
