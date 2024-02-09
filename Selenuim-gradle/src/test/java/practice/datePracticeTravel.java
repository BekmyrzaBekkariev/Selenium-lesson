package practice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.awt.Color.white;
import static java.awt.SystemColor.text;

public class datePracticeTravel {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companion/");

        Thread.sleep(3000L);
        driver.findElement(By.xpath("/html/body/div[10]/div[2]/div[1]/div[2]/div[2]/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[10]/div[2]/div[2]/div[3]/div[2]/button[1]")).click();

        Thread.sleep(3000L);

        driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_date\"]")).click();

        List<WebElement> dates = driver.findElements(By.className(".day"));

        int count = driver.findElements(By.className(".day")).size();
        for (int i = 0; i < count; i++) {

            String text = driver.findElements(By.className(".day")).get(i).getText();
            if (text.equalsIgnoreCase("23")){
                driver.findElements(By.className(".day")).get(i).click();
            }

        }

    }
}
