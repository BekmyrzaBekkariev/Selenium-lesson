import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class s2 {
	public static void main(String[] args) {
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://firefox.com");
	}
}
