package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhanv\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
//		WebElement build2 = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[2]/td/ul/li[2]/a/strong"));
//		build2.click();
		WebElement login = driver.findElement(By.id("username"));
		login.sendKeys("Dhanveerkhan98");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Khan@1998", Keys.ENTER);
		WebElement scroll = driver.findElement(By.id("location"));
		Select s1 = new Select(scroll);
		s1.selectByIndex(4);
		WebElement second = driver.findElement(By.id("hotels"));
		Select s2 = new Select(second);
		s2.selectByIndex(2);
		WebElement third = driver.findElement(By.id("room_type"));
		Select s3 = new Select(third);
		s3.selectByIndex(2);
		WebElement fourth = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(fourth);
		s4.selectByIndex(4);
		WebElement fifth = driver.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
		Thread.sleep(6000);
		fifth.sendKeys("07/04/2022");
		WebElement sixth = driver.findElement(By.xpath("//input[@id=\"datepick_out\"]"));
		sixth.sendKeys("08/04/2022");
		WebElement seven = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(seven);
		s5.selectByIndex(2);
		WebElement eight = driver.findElement(By.id("child_room"));
		Select s6 = new Select(eight);
		s6.selectByIndex(2);
		WebElement nine = driver.findElement(By.id("Submit"));
		nine.click();
		WebElement ten = driver.findElement(By.id("radiobutton_0"));
		ten.click();
		WebElement eleven = driver.findElement(By.id("continue"));
		eleven.click();
		WebElement twelve = driver.findElement(By.id("first_name"));
		twelve.sendKeys("Dhanveer");
		WebElement thirteen = driver.findElement(By.id("last_name"));
		thirteen.sendKeys("khan");
		WebElement fourteen = driver.findElement(By.id("address"));
		fourteen.sendKeys("chenai");
		WebElement fifteen = driver.findElement(By.id("cc_num"));
		fifteen.sendKeys("1234567893214569");
		WebElement sixteen = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(sixteen);
		s7.selectByIndex(2);
		WebElement seventeen = driver.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(seventeen);
		s8.selectByIndex(3);
		WebElement eighteen = driver.findElement(By.id("cc_exp_year"));
		Select s9 = new Select(eighteen);
		s9.selectByIndex(3);
		WebElement ninteen = driver.findElement(By.id("cc_cvv"));
		ninteen.sendKeys("123");
		WebElement twenty = driver.findElement(By.id("book_now"));
		twenty.click();
		Thread.sleep(6000);
		WebElement one = driver.findElement(By.id("order_no"));
		String d = one.getAttribute("value");
		System.out.println(d);
		driver.quit();
		
		
	}
}
