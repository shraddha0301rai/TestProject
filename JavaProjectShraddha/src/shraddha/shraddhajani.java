package shraddha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shraddhajani {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//HP//Desktop//Shraddha//chromedriver_win32//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath(".//*[@id='u_0_n']")).sendKeys("Shraddha");
			driver.findElement(By.name("Surname")).sendKeys("Rai");
			Thread.sleep(5000);
			driver.close();

	}

}
