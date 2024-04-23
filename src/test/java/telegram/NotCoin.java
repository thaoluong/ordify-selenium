package telegram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotCoin {
	WebDriver driver ;
	
	public static void MailDropcc(String email) throws InterruptedException {

		for (int i = 100; i <200; i++) {

			WebDriver driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get("https://referral.ordify.world?r=VBCTKQEU");
			driver.findElement(By.name("email")).sendKeys(email + i + "@maildrop.cc");
			driver.findElement(By.xpath("//button")).click();
			Thread.sleep(1000);
		}
	}

}
