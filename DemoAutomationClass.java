import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomationClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\BrowserDriver\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\BrowserDriver\\msedgedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("https://dig.testnet.user.block-stars-dev.com/"); 
	}

}
