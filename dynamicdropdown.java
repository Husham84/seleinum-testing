import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Husham Ibrahim\\Downloads\\selenium\\selenium\\Library\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='KQH'])[2]")).click();
		
		
	}

}
