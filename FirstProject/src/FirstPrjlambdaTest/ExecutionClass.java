package FirstPrjlambdaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manik\\Desktop\\Prabha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.getTitle();
  	
		driver.navigate().to("https://google.co.nz");
		driver.close();
	}
	

}
