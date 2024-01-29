import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenKart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		// sin
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.xpath("\t\t/html/body/div/div/div[1]/div/div[1]/div[2]/a[2]\n")).click();
		}
		// click
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div[3]/button")).click();

		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div[2]/a[2]")).click();
		// click
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div[3]/button")).click();

		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("\t\t\t/html/body/div/div/div[1]/div/div[3]/div[2]/a[2]\n")).click();
		}
		// click
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div[3]/button")).click();

		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("\t\t/html/body/div/div/div[1]/div/div[4]/div[2]/a[2]\n")).click();
		}

		// sin

		// click
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[4]/div[3]/button")).click();


		driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/a[4]/img")).click();

		// cancel order
		driver.findElement(By.xpath("\t\t//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li[4]/a\n")).click();

		// submite order
		driver.findElement(By.xpath("\t\t//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button\n")).click();

		// new page
		Thread.sleep(5000L);
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");


		// apply
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/button")).click();
		Thread.sleep(7000L);

		driver.findElement(By.xpath("\t\t//*[@id=\"root\"]/div/div/div/div/button\n")).click();

//		//new page
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select")).sendKeys("po");

		driver.findElement(By.className("chkAgree")).click();


		driver.findElement(By.xpath("\t\t/html/body/div/div/div/div/div/button\n")).click();


	}
}
