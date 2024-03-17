package ordifyRefferals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class RefferMailDrop {
		
		WebDriver driver ;
		
		public static void MailDropcc(String email) throws InterruptedException {

			for (int i = 1; i <100; i++) {

				WebDriver driver = new ChromeDriver();

				driver.get("https://referral.ordify.world?r=VBCTKQEU");
				driver.findElement(By.name("email")).sendKeys(email + i + "@maildrop.cc");
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
		
		@Test
		public void test01() throws InterruptedException {
			MailDropcc("paul1c");
		}
		
		@Test
		public void test02() throws InterruptedException {
			MailDropcc("johndoe1c");
		}
		
		@Test
		public void test03() throws InterruptedException {
			MailDropcc("david1c");
		}
		
		@Test
		public void test04() throws InterruptedException {
			MailDropcc("helen1c");
		}
		
		@Test
		public void test05() throws InterruptedException {
			MailDropcc("joshua1c");
		}
		
		@Test
		public void test06() throws InterruptedException {
			MailDropcc("tom1c");
		}
		
		@Test
		public void test07() throws InterruptedException {
			MailDropcc("denies1c");
		}
		
		@Test
		public void test08() throws InterruptedException {
			MailDropcc("noway1c");
		}
		@Test
		public void test09() throws InterruptedException {
			MailDropcc("moon1c");
		}
		
		@Test
		public void test10() throws InterruptedException {
			MailDropcc("pump1c");
		}
		
		@AfterTest
		public void quit() {
			driver.quit();
		}

}
