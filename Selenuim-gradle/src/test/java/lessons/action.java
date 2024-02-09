package lessons;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import javax.swing.*;

public class action {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.pl/");
        ((JavascriptExecutor) driver).executeScript("document.getElementById('sp-cc-accept').click();");

        //Actions
        Actions mous = new Actions(driver);
        WebElement move = driver.findElement(By.id("nav-link-accountList"));
        mous.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        // move to specific element
        mous.moveToElement(move).contextClick().build().perform();
        // mous.moveToElement(move).build() - dragon drop


    }
}