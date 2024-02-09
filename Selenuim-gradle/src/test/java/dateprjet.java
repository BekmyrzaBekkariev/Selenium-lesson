import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class dateprjet {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input")).click();
		Thread.sleep(300L);

		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(300L);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(300L);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]")).click();
		Thread.sleep(300L);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]")).click();
		Thread.sleep(300L);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[5]")).click();
		Thread.sleep(300L);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[1]/div[6]")).click();
		Thread.sleep(300L);

// part 2
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div/div[1]")).click();
		Thread.sleep(300L);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div[5]")).click();
		Thread.sleep(300L);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[1]/div[2]")).click();
		Thread.sleep(300L);

		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div[6]")).click();
		Thread.sleep(300L);

		// usd command
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]")).click();
		Thread.sleep(300L);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div/div[3]")).click();
		Thread.sleep(300L);

		// part кнопки условия
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div")).click();
		Thread.sleep(300L);
		// Хорошо если один клик а если там 10 что тогда loop for
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
			Thread.sleep(100L);
		}
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(100L);
		}
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[3]")).click();
			Thread.sleep(100L);
		}

		// done command
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div	")).click();
		Thread.sleep(300L);

		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[1]/div/div/div[1]")).click();

		// submit command
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();

		// ВОТ ЭТО ПРОРЫВ при открытии новой страницы то происходит загрузка и нужно дать немного
		// времени для того что бы загрузились думаю 3 сек достаточно
		Thread.sleep(3000L);
		// check box

		driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[3]/div/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[3]/div/div[3]/div")).click();

		//driver.close();
	}
}
