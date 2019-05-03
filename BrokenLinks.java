package SelScripts;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrokenLinks {

	@Test
	public void n1() throws InterruptedException {
		// Instantiating FirefoxDriver
		System.setProperty("webdriver.gecko.driver", "F:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// To launch softwaretestingmaterial.com
		driver.get("https://www.softwaretestingmaterial.com/oops-concept-in-automation-framework/");
		// Wait for 5 seconds
		Thread.sleep(5000);
		// Used tagName method to collect the list of items with tagName "a"
		// findElements - to find all the elements with in the current page. It returns
		// a list of all webelements or an empty list if nothing matches
		String text=driver.findElement(By.xpath("//ul[contains(@style,'list-style-type: disc;')]")).getAttribute("style");
		System.out.println(text);
		
		WebElement ele=driver.findElement(By.xpath("//ul[contains(@style,'list-style-type: disc;')]"));
		
		
		List<WebElement> links = ele.findElements(By.tagName("a"));
		
		int Linkcount=ele.findElements(By.tagName("a")).size();
		System.out.println(Linkcount);
		
		// To print the total number of links
		System.out.println("Total links are " + links.size());
		// used for loop to
		for (int i = 0; i < links.size(); i++) {
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			ele.findElements(By.tagName("a")).get(i).sendKeys(click);
		
			// calling verifyLink() method here. Passing the parameter as url which we
			// collected in the above link
			// See the detailed functionality of the verifyLink(url) method below
			//verifyLink(url);
		}
	}

}