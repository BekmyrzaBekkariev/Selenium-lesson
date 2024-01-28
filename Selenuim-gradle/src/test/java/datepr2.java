import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepr2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/search?from=BKK&to=DWC&tripType=2&departure=2024-02-09&adult=5&child=2&srCitizen=0&infant=3&return=2024-02-10&currency=USD&specialCategory=F&redirectTo=/");

		driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[3]/div/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[3]/div/div[3]/div")).click();

	}
}
