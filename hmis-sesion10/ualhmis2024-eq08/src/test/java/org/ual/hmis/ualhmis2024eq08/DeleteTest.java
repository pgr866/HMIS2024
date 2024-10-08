// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class DeleteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
		int browser = 0; // 0: firefox, 1: chrome, 2: htmlunit,...
	    Boolean headless = true;

	    switch (browser) {
	    case 0:
	    	if (System.getProperty("os.name").toLowerCase().contains("win"))
	    		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
	    	FirefoxOptions firefoxOptions = new FirefoxOptions(); 
	    	firefoxOptions.addArguments("--start-maximized");
	    	firefoxOptions.addArguments("--disable-popup-blocking");
	    	firefoxOptions.addArguments("--disable-extensions");
	    	if (headless) firefoxOptions.addArguments("--headless");
	        driver = new FirefoxDriver(firefoxOptions);
	    	break;
	    case 1:
	    	if (System.getProperty("os.name").toLowerCase().contains("win"))
	    		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	    	ChromeOptions chromeOptions = new ChromeOptions();
		    chromeOptions.addArguments("--start-maximized");
		    chromeOptions.addArguments("--disable-popup-blocking");
		    chromeOptions.addArguments("--disable-extensions");
		    if (headless) chromeOptions.addArguments("--headless");
		    driver = new ChromeDriver(chromeOptions);
	    	break;
	    case 2:
	    	driver = new HtmlUnitDriver(BrowserVersion.FIREFOX, true);
	    	break;
	    default:
	    	fail("Please select a browser");
	    	break;
	    }

		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();

		// Configurar timeouts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.get("https://my-app-1715855750474.azurewebsites.net/login");
		driver.findElement(By.id("input-vaadin-text-field-6")).sendKeys("admin");
		driver.findElement(By.id("input-vaadin-password-field-7")).sendKeys("admin");
		driver.findElement(By.cssSelector("vaadin-button:nth-child(2)")).click();
	}
  @After
  public void tearDown() {
    driver.quit();
  }
  
  @Test
  public void DeleteFail() {
    // Test name: 21.Delete_Fail
    // Step # | name | target | value
    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
    // 2 | click | css=vaadin-button:nth-child(3) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(3)")).click();
    // 3 | assertText | css=vaadin-notification-card | No person selected to delete
    assertThat(driver.findElement(By.cssSelector("vaadin-notification-card")).getText(), is("No person selected to delete"));
  }
  @Test
  public void DeleteSuccess() {
    // Test name: 22.Delete_Success
    // Step # | name | target | value
    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
    // 2 | click | css=vaadin-grid-cell-content:nth-child(33) | 
    driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(33)")).click();
    // 3 | click | css=vaadin-button:nth-child(3) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(3)")).click();
    // 4 | assertNotText | css=vaadin-notification-card | Jesus
    assertThat(driver.findElement(By.cssSelector("vaadin-notification-card")).getText(), is(not("Jesus")));
  }
}
