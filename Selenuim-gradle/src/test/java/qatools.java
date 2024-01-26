import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qatools {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");

		// id - с помощью этого мы сделали
		driver.findElement(By.id("firstName")).sendKeys("Bekmyrza");

		// xpath - с помощью этого мы сделали
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Bekkariev");

		// cssSelector - с помощью этого мы сделали
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("bekmyrzabekkariev2005@gmail.com");

		// xpath
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/label	")).click();




		driver.findElement(By.id("userNumber")).sendKeys("48538455994");

		// дополнение

		driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")).sendKeys("2005");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).sendKeys("September");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[6]")).click();



		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[1]")).click();


		driver.findElement(By.id("subjectsInput")).sendKeys("p");
		driver.findElement(By.id("subjectsInput")).click();

		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Stoclosy 2/4 m6");


		// driver.findElement(By.id("hobbies-checkbox-1")).click();
		// driver.close();

		driver.close(); // закрывает страницу
//	driver.quit(); // полностью закрывает все в окне
	}
}
