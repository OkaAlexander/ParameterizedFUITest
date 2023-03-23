package PageObject;

import AbstractPage.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.security.Key;

public class LandingPage extends AbstractPage {

    private final By linkBackBone=By.cssSelector("a[href='examples/backbone']");
    private final By txtTodo=By.cssSelector("input.new-todo ");
    private final By todoRadioBtn=By.cssSelector("input.toggle");

    public LandingPage(WebDriver driver) {
        super(driver);
    }
    private WebElement waitAndFindElement(By locator){
        return (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    private void inputFill(By inputElement,String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputElement));
        driver.findElement(inputElement).sendKeys(text);


    }
    public void setTxtTodo(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtTodo));
        for (int x=0;x<5;x++){
            inputFill(txtTodo,text);
        }
    }
   public void clickTodoRadioBtn(){
        waitAndFindElement(todoRadioBtn).click();
   }
    public void clickOnBackBone(String technologies){
        var technologyLink=waitAndFindElement(By.linkText(technologies));
        technologyLink.click();
    }
    public String getPageTitle(){
        return driver.getTitle();

    }
}
