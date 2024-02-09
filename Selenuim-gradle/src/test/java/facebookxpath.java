import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {
	public static void main(String[] args) {


		// use only xpath registration facebook

		//System.setProperty("web driver.chrome.driver", "/home/bekmyrza/Downloads/chromedriver-linux64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[4]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("bekmyrzabekkariev05@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("bekmyrzabekmyrza05");
		driver.findElement(By.xpath("/html/body/div[	1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		//		driver.close();

	}
}
