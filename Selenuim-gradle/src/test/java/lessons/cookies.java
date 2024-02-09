package lessons;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wordstream.com/blog/ws/2022/07/14/website-examples");
        ((JavascriptExecutor) driver ).executeScript("document.getElementById('onetrust-accept-btn-handler').click();");
    }

}
