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
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  private static final Logger logger = Logger.getLogger(LoginTest.class.getName());

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
	}

  @After
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }
  
  @Test
  public void Loginfail() {
    // Test name: 1.Login_fail
    // Step # | name | target | value
    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
    // 2 | type | id=input-vaadin-text-field-6 | usuario
    driver.findElement(By.id("input-vaadin-text-field-6")).sendKeys("usuario");
    // 3 | type | id=input-vaadin-password-field-7 | contrasena
    driver.findElement(By.id("input-vaadin-password-field-7")).sendKeys("contrasena");
    // 4 | click | css=vaadin-button:nth-child(2) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(2)")).click();
    // 5 | waitForElementNotPresent | css=vaadin-app-layout | 5000
    {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("vaadin-app-layout")));
    }
  }
  @Test
  public void Loginsucces() {
    // Test name: 2.Login_succes
    // Step # | name | target | value
    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
    // 2 | type | id=input-vaadin-text-field-6 | admin
    driver.findElement(By.id("input-vaadin-text-field-6")).sendKeys("admin");
    // 3 | type | id=input-vaadin-password-field-7 | admin
    driver.findElement(By.id("input-vaadin-password-field-7")).sendKeys("admin");
    // 4 | click | css=vaadin-button:nth-child(2) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(2)")).click();
    // 5 | waitForElementPresent | css=vaadin-app-layout | 5000
    {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("vaadin-app-layout")));
    }
  }
}
