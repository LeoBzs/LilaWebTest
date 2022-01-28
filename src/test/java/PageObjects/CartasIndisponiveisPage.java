package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Base.TestBase.getDriver;

public class CartasIndisponiveisPage {

    private final WebDriver driver = getDriver();

    private final Waits waits;

    Actions action = new Actions(driver);

    public CartasIndisponiveisPage(WebDriver driver){
        waits = new Waits(driver);
    }

    public WebElement getClick(){
        return waits.visibilityOfElement(By.xpath("/html/body/app-root/app-mesa-jogo/div/nav/app-area-de-compra/div/div/div[2]/div[2]/div[1]/div[2]/p"));
    }

    public WebElement getCartaIndisponivel(){
        return (WebElement) action.moveToElement((WebElement) By.xpath("/html/body/app-root/app-mesa-jogo/div/nav/app-area-de-compra/div/div/div[2]/div[2]/div[1]"));
    }
}
