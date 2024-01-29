import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class greenKartSin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			performActions(driver, wait);
		} finally {
			driver.quit();
		}
	}

	private static void performActions(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		performThreadedActions(driver, wait);

		// Other actions after threads are finished
		driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/a[4]/img")).click();

		// cancel order
		driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li[4]/a")).click();

		// submit order
		driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/div[2]/div[2]/button")).click();

		// new page
		Thread.sleep(5000L);
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");

		// apply
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/button")).click();
		Thread.sleep(7000L);

		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/button")).click();

		// new page
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/select")).sendKeys("po");

		driver.findElement(By.className("chkAgree")).click();

		driver.findElement(By.xpath("/html/body/div/div/div/div/div/button")).click();
	}

	private static void performThreadedActions(WebDriver driver, WebDriverWait wait) {
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 2; i++) {
				driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div[2]/a[2]")).click();
			}
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[1]/div/div[1]/div[3]/button"))).click();
		});

		Thread thread2 = new Thread(() -> {
			WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div[2]/a[2]"));
			element.click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[1]/div/div[2]/div[3]/button"))).click();
		});

		Thread thread3 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div[2]/a[2]")).click();
			}
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[1]/div/div[3]/div[3]/button"))).click();
		});

		Thread thread4 = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[4]/div[2]/a[2]")).click();
			}
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[1]/div/div[4]/div[3]/button"))).click();
		});

		// Start the threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		// Wait for all threads to finish
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
