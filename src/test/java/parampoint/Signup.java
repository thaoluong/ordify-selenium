package parampoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Signup {

	WebDriver driver;

	public static void RefferParams(String email, String password, String cPassword) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
//			WebDriver driver = new ChromeDriver();
			WebDriver driver = new FirefoxDriver();

//			driver.get("https://paramgaming.com/?referCode=C9E0C37A4E#/signup");
			
			driver.get("https://paramgaming.com/?referCode=00A8F77024#/signup");
			Thread.sleep(2000);

			driver.findElement(By.id("email")).sendKeys(email + i + "@maildrop.cc");
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("cPassword")).sendKeys(cPassword);
			driver.findElement(By.id("disclaimer")).click();
			driver.findElement(By.xpath("//button[@class='custom_button' and @type = 'submit']")).click();
			Thread.sleep(2000);

			driver.get("https://maildrop.cc/inbox/?mailbox=" + email + i);
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);

			if (driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")).isDisplayed()) {
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")));
				Thread.sleep(2000);

				driver.findElement(By.xpath("//a[@class= 'link']")).click();

				Thread.sleep(3000);
				System.out.println(email+i);
				driver.quit();

			} else {
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		}
	}


	@Test
	public void test01() throws InterruptedException {
		RefferParams("trongdat3aa", "12345678", "12345678");
	}
	@Test
	public void test02() throws InterruptedException {
		RefferParams("little-kiwi63sa", "12345678", "12345678");
	}
	@Test
	public void test03() throws InterruptedException {
		RefferParams("miumiu3sa", "12345678", "12345678");
	}
	@Test
	public void test04() throws InterruptedException {
		RefferParams("bigmom3sa", "12345678", "12345678");
	}
	@Test
	public void test05() throws InterruptedException {
		RefferParams("bigdad3sa", "12345678", "12345678");
	}
	@Test
	public void test06() throws InterruptedException {
		RefferParams("mytier3sa", "12345678", "12345678");
	}
	@Test
	public void test07() throws InterruptedException {
		RefferParams("myreffer3sa", "12345678", "12345678");
	}
	@Test
	public void test08() throws InterruptedException {
		RefferParams("loveparadise3sa", "12345678", "12345678");
	}
	@Test
	public void test09() throws InterruptedException {
		RefferParams("takeyama3sa", "12345678", "12345678");
	}
	@Test
	public void test10() throws InterruptedException {
		RefferParams("mia-haha3sa", "12345678", "12345678");
	}
}
