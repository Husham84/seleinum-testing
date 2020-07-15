import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindActiveElement;
import org.openqa.selenium.support.ui.Select;

public class spicejet {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Husham Ibrahim\\Downloads\\selenium\\selenium\\Library\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//Thread.sleep(2000L);
		//driver.findElement(By.id("divpaxinfo")).click();
		//Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		//s.selectByValue("1");
		Thread.sleep(2000L);
		driver.findElement(By.id("divpaxinfo")).click();
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("5");
		Thread.sleep(5000L);
		s.selectByValue("3");

		
	}
}

