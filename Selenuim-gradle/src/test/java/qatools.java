import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qatools {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.navigate().forward();
		driver.findElement(By.id("firstName")).sendKeys("Bekmyrza");
		driver.findElement(By.id("lastName")).sendKeys("Bekkariev");
		driver.findElement(By.id("userEmail")).sendKeys("bekmyrzabekkariev2005@gmail.com");
		//driver.findElement(By.id("gender-radio-1")).click();

		driver.findElement(By.id("userNumber")).sendKeys("+48538455994");
		driver.findElement(By.id("subjectsInput")).sendKeys("qa engineer");
		// driver.findElement(By.id("hobbies-checkbox-1")).click();










//		driver.close(); // закрывает страницу
//	driver.quit(); // полностью закрывает все в окне
	}
}
