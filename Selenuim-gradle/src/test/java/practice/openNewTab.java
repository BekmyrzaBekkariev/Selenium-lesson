package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class openNewTab {
    public static void main(String[] args) throws InterruptedException {
        //https://rahulshettyacademy.com/AutomationPractice/

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));

        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        // 3
        WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        System.out.println(coloumndriver.findElements(By.tagName("a")).size());
        //4 - click on each link in the coloum and check if the pages are opening -
        for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {

            String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

            coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);

            Thread.sleep(5000L);
        }
        Set<String> abc = driver.getWindowHandles();//4
        Iterator<String> it = abc.iterator();

        while(it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }


    }
}
