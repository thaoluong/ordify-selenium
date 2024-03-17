package ordifyRefferals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstTest {

//	@Test
	public static void test1() throws InterruptedException {

		String email = "miracle";

		// TODO Auto-generated method stub

		for (int i = 100; i < 200; i++) {
			WebDriver driver = new ChromeDriver();

			driver.get("https://referral.ordify.world?r=VBCTKQEU");

			driver.findElement(By.name("email")).sendKeys(email + i + "@yopmail.com");

			driver.findElement(By.xpath("//button")).click();

			System.out.println(email + i + "@yopmail.com");
			Thread.sleep(1000);
//			driver.close();

			driver.get("https://yopmail.com");

			Thread.sleep(1000);

//			
			driver.findElement(By.id("login")).sendKeys(email + i);

			driver.findElement(By.xpath("//button[@class='md']")).click();
//			
			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[text()='Confirm your mail']")).click();
//			driver.findElement(By.linkText("Confirm your mai")).click();

//			driver.close();

		}

	}

//	@Test
	public static void test2() throws InterruptedException {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			WebDriver driver = new ChromeDriver();

			driver.get("https://yopmail.com");

			driver.findElement(By.id("login")).sendKeys("myref" + i);

			driver.findElement(By.xpath("//button[@class='md']")).click();

		}
	}

//		@Test
	public static void test3() throws InterruptedException {

		String email = "tieptt.babk+" + "";

		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		for (int i = 0; i < 10; i++) {

			driver.get("https://referral.ordify.world?r=VBCTKQEU");

			driver.findElement(By.name("email")).sendKeys(email + i + "@gmail.com");

			driver.findElement(By.xpath("//button")).click();

			System.out.println(email + i + "@gmail.com");
//				Thread.sleep(1000);
//				driver.close();

//				driver.get("https://yopmail.com");

			Thread.sleep(1000);

		}

	}

//	@Test
	public static void test4() throws InterruptedException {

		String email = "ongtho";

		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			WebDriver driver = new ChromeDriver();

			driver.get("https://yopmail.com");

			Thread.sleep(1000);

			driver.findElement(By.id("login")).sendKeys(email + i);

			driver.findElement(By.xpath("//button[@class='md']")).click();

		}

	}

//	@Test
	public static void maildrop() throws InterruptedException {

		String email = "bvm";
		for (int i = 1; i < 100; i++) {

			WebDriver driver = new ChromeDriver();

			driver.get("https://referral.ordify.world?r=VBCTKQEU");
			driver.findElement(By.name("email")).sendKeys(email + i + "@maildrop.cc");
			driver.findElement(By.xpath("//button")).click();
			Thread.sleep(3000);


			driver.get("https://maildrop.cc/inbox/?mailbox=" + email + i);

//			Thread.sleep(1000);
//			
//			driver.findElement(By.xpath(
//					"//form[@class='px-8 md:px-0 lg:max-w-[50ch] flex flex-auto flex-wrap md:flex-nowrap']//div[@class='flex flex-auto flex-nowrap items-center']//input[@type='text']"))
//					.sendKeys(email + i);
//
//			driver.findElement(By.xpath(
//					"//form[@class='px-8 md:px-0 lg:max-w-[50ch] flex flex-auto flex-wrap md:flex-nowrap']//button[@type='submit']//span[@class='ml-2 md:hidden lg:inline'][contains(text(),'View Mailbox')]"))
//					.click();
//			
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);



//			do {
//				driver.navigate().refresh();
////				driver.findElement(By.xpath("//button[@type='button']")).click();
//				Thread.sleep(3000);
//			}
//
//			while (driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")).isDisplayed() == false);
//
//			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")));
//			String link = driver.findElement(By.xpath("//a[contains(text(),'Confirm your mail')]"))
//					.getAttribute("href");
//			driver.get(link);
//			System.out.print(link);
//			Thread.sleep(5000);
//			driver.quit();

			if (driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")).isDisplayed()) {
				Thread.sleep(1000);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")));
				Thread.sleep(2000);
				String link = driver.findElement(By.xpath("//a[contains(text(),'Confirm your mail')]"))
						.getAttribute("href");
				driver.get(link);
				System.out.print(email+i+": "+link);
				Thread.sleep(5000);
				driver.quit();

			} else {
				driver.navigate().refresh();
				Thread.sleep(5000);
			}
		}
	}
	
	@Test
	public static void Test10() throws InterruptedException {

		String email = "lucy1";
		for (int i = 1; i < 100; i++) {

			WebDriver driver = new ChromeDriver();

			driver.get("https://referral.ordify.world?r=VBCTKQEU");
			driver.findElement(By.name("email")).sendKeys(email + i + "@maildrop.cc");
			driver.findElement(By.xpath("//button")).click();
			Thread.sleep(3000);


			driver.get("https://maildrop.cc/inbox/?mailbox=" + email + i);		
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);

			if (driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")).isDisplayed()) {
				Thread.sleep(1000);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")));
				Thread.sleep(2000);
				String link = driver.findElement(By.xpath("//a[contains(text(),'Confirm your mail')]"))
						.getAttribute("href");
				driver.get(link);
				System.out.println(email+i+": "+link);
				Thread.sleep(5000);
				driver.quit();

			} else {
				driver.navigate().refresh();
				Thread.sleep(5000);
			}
		}
	}
	@Test
	public static void Test9() throws InterruptedException {

		String email = "kate1";
		for (int i = 1; i < 100; i++) {

			WebDriver driver = new ChromeDriver();

			driver.get("https://referral.ordify.world?r=VBCTKQEU");
			driver.findElement(By.name("email")).sendKeys(email + i + "@maildrop.cc");
			driver.findElement(By.xpath("//button")).click();
			Thread.sleep(3000);


			driver.get("https://maildrop.cc/inbox/?mailbox=" + email + i);		
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);

			if (driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")).isDisplayed()) {
				Thread.sleep(1000);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")));
				Thread.sleep(2000);
				String link = driver.findElement(By.xpath("//a[contains(text(),'Confirm your mail')]"))
						.getAttribute("href");
				driver.get(link);
				System.out.println(email+i+": "+link);
				Thread.sleep(5000);
				driver.quit();

			} else {
				driver.navigate().refresh();
				Thread.sleep(5000);
			}
		}
	}
	@Test
	public static void Test8() throws InterruptedException {

		String email = "jacky1";
		for (int i = 1; i < 100; i++) {

			WebDriver driver = new ChromeDriver();

			driver.get("https://referral.ordify.world?r=VBCTKQEU");
			driver.findElement(By.name("email")).sendKeys(email + i + "@maildrop.cc");
			driver.findElement(By.xpath("//button")).click();
			Thread.sleep(3000);


			driver.get("https://maildrop.cc/inbox/?mailbox=" + email + i);		
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);

			if (driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")).isDisplayed()) {
				Thread.sleep(1000);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")));
				Thread.sleep(2000);
				String link = driver.findElement(By.xpath("//a[contains(text(),'Confirm your mail')]"))
						.getAttribute("href");
				driver.get(link);
				System.out.println(email+i+": "+link);
				Thread.sleep(5000);
				driver.quit();

			} else {
				driver.navigate().refresh();
				Thread.sleep(5000);
			}
		}
	}
	@Test
	public static void Test7() throws InterruptedException {

		String email = "zon1";
		for (int i = 1; i < 100; i++) {

			WebDriver driver = new ChromeDriver();

			driver.get("https://referral.ordify.world?r=VBCTKQEU");
			driver.findElement(By.name("email")).sendKeys(email + i + "@maildrop.cc");
			driver.findElement(By.xpath("//button")).click();
			Thread.sleep(3000);


			driver.get("https://maildrop.cc/inbox/?mailbox=" + email + i);		
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);

			if (driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")).isDisplayed()) {
				Thread.sleep(1000);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")));
				Thread.sleep(2000);
				String link = driver.findElement(By.xpath("//a[contains(text(),'Confirm your mail')]"))
						.getAttribute("href");
				driver.get(link);
				System.out.println(email+i+": "+link);
				Thread.sleep(5000);
				driver.quit();

			} else {
				driver.navigate().refresh();
				Thread.sleep(5000);
			}
		}
	}
	@Test
	public static void Test6() throws InterruptedException {

		String email = "nick1";
		for (int i = 1; i < 100; i++) {

			WebDriver driver = new ChromeDriver();

			driver.get("https://referral.ordify.world?r=VBCTKQEU");
			driver.findElement(By.name("email")).sendKeys(email + i + "@maildrop.cc");
			driver.findElement(By.xpath("//button")).click();
			Thread.sleep(3000);


			driver.get("https://maildrop.cc/inbox/?mailbox=" + email + i);		
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);

			if (driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")).isDisplayed()) {
				Thread.sleep(1000);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")));
				Thread.sleep(2000);
				String link = driver.findElement(By.xpath("//a[contains(text(),'Confirm your mail')]"))
						.getAttribute("href");
				driver.get(link);
				System.out.println(email+i+": "+link);
				Thread.sleep(5000);
				driver.quit();

			} else {
				driver.navigate().refresh();
				Thread.sleep(5000);
			}
		}
	}
	@Test
	public static void Test5() throws InterruptedException {

		String email = "kong1";
		for (int i = 1; i < 100; i++) {

			WebDriver driver = new ChromeDriver();

			driver.get("https://referral.ordify.world?r=VBCTKQEU");
			driver.findElement(By.name("email")).sendKeys(email + i + "@maildrop.cc");
			driver.findElement(By.xpath("//button")).click();
			Thread.sleep(3000);


			driver.get("https://maildrop.cc/inbox/?mailbox=" + email + i);		
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);

			if (driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")).isDisplayed()) {
				Thread.sleep(1000);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full overflow-scroll']")));
				Thread.sleep(2000);
				String link = driver.findElement(By.xpath("//a[contains(text(),'Confirm your mail')]"))
						.getAttribute("href");
				driver.get(link);
				System.out.println(email+i+": "+link);
				Thread.sleep(5000);
				driver.quit();

			} else {
				driver.navigate().refresh();
				Thread.sleep(5000);
			}
		}
	}
}
