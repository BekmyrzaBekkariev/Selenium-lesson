package lessons;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uiTest {
    public static void main(String[] args) {
        //https://jqueryui.com/droppable/
        // UI TEST
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();


        //driver.switchTo().frame(1);

        System.out.println(driver.findElement(By.tagName("iframe")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        // driver.findElement(By.id("draggable")).click();
        // Action - теперь нужно перенести это
        Actions dragon = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        dragon.dragAndDrop(source, target).build().perform();
    }
}
