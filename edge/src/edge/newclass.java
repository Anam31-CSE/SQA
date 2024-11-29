package edge;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\SQA Course\\SQA soft\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hachnat.stage-carelogix.de/sing-in");
		try {
			WebElement username = driver.findElement(By.xpath("//*[@id=\"credential\"]"));
			WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/form/div[4]/button"));
			
			username.sendKeys("Anamul");
			pass.sendKeys("Carelogix24!!");
			login.click();

		} catch(Exception e) {
			System.out.println("Error here");
		} finally {
			System.out.println("Test Ok !");
	//driver.quit();
		}
	}

}
