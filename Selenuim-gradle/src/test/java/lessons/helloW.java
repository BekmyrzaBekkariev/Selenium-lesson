package lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;


// Перед вами быстрый код - так как он показывает результат уже тогда когда идет загрузка на сайте
public class helloW {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();


		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
										.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchFieldException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				if (driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/h4")).isDisplayed())
				{
					return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/h4"));
				}
				else
					return null;
			}
		});

		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/h4")).getText());


		//Thread.sleep(7000L);

		//System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/h4")).getText());
	}
}

