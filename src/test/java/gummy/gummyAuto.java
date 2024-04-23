package gummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gummyAuto {
	
	static String url = "https://banterbubbles.com/";
	
	WebDriver driver ;
	
	public static void MailDropcc(String email) throws InterruptedException {

		for (int i = 100; i <200; i++) {

			WebDriver driver = new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get(url);
			driver.findElement(By.xpath("//div[@class='flex flex-row items-center justify-center']")).click();
			
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();
			
			
			driver.findElement(By.xpath("//button")).click();
			Thread.sleep(1000);


			driver.get("https://maildrop.cc/inbox/?mailbox=" + email + i);		
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);


			if (driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")).isDisplayed()) {
				Thread.sleep(2000);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")));
				Thread.sleep(1000);
				String link = driver.findElement(By.xpath("//a[contains(text(),'Confirm your mail')]"))
						.getAttribute("href");
				driver.get(link);
				System.out.println(email+i+": "+link);
				Thread.sleep(2000);
				driver.quit();

			} else {
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		}
	}

}
