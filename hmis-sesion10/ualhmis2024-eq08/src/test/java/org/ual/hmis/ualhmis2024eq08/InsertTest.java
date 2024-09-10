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
import org.openqa.selenium.TimeoutException;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class InsertTest {
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
  public void InsertSuccess() {
    // Test name: 3.Insert_Success
    // Step # | name | target | value
    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
    // 2 | click | css=vaadin-button:nth-child(2) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(2)")).click();
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    // 3 | type | id=input-vaadin-text-field-23 | Pablo
    driver.findElement(By.id("input-vaadin-text-field-23")).sendKeys("Pablo");
    // 4 | click | id=input-vaadin-text-field-24 | 
    driver.findElement(By.id("input-vaadin-text-field-24")).click();
    // 5 | type | id=input-vaadin-text-field-24 | Gomez
    driver.findElement(By.id("input-vaadin-text-field-24")).sendKeys("Gomez");
    // 6 | click | id=input-vaadin-text-field-25 | 
    driver.findElement(By.id("input-vaadin-text-field-25")).click();
    // 7 | type | id=input-vaadin-text-field-25 | hola@gmail.com
    driver.findElement(By.id("input-vaadin-text-field-25")).sendKeys("hola@gmail.com");
    // 8 | click | id=input-vaadin-text-field-26 | 
    driver.findElement(By.id("input-vaadin-text-field-26")).click();
    // 9 | type | id=input-vaadin-text-field-26 | 666666666
    driver.findElement(By.id("input-vaadin-text-field-26")).sendKeys("666666666");
    // 10 | click | id=input-vaadin-date-picker-27 | 
    driver.findElement(By.id("input-vaadin-date-picker-27")).click();
    // 11 | type | id=input-vaadin-date-picker-27 | 5/6/2000
    driver.findElement(By.id("input-vaadin-date-picker-27")).sendKeys("5/6/2000");
    // 12 | click | css=html | 
    driver.findElement(By.cssSelector("html")).click();
    // 13 | type | id=input-vaadin-text-field-28 | Almeria
    driver.findElement(By.id("input-vaadin-text-field-28")).sendKeys("Almeria");
    // 14 | click | id=input-vaadin-text-field-29 | 
    driver.findElement(By.id("input-vaadin-text-field-29")).click();
    // 15 | type | id=input-vaadin-text-field-29 | Worker
    driver.findElement(By.id("input-vaadin-text-field-29")).sendKeys("Worker");
    // 16 | click | css=vaadin-button:nth-child(1) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(1)")).click();
    {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		try { wait.until(driver -> false); } catch (TimeoutException e) {}
	}
    // 17 | assertText | css=vaadin-grid-cell-content:nth-child(49) | Pablo
    assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(41)")).getText(), is("Pablo"));
    // 18 | assertText | css=vaadin-grid-cell-content:nth-child(50) | Gomez
    assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(42)")).getText(), is("Gomez"));
    // 19 | assertText | css=vaadin-grid-cell-content:nth-child(51) | hola@gmail.com
    assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(43)")).getText(), is("hola@gmail.com"));
    // 20 | assertText | css=vaadin-grid-cell-content:nth-child(52) | 666666666
    assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(44)")).getText(), is("666666666"));
    // 21 | assertText | css=vaadin-grid-cell-content:nth-child(53) | 2024-06-05
    assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(45)")).getText(), is("2000-05-06"));
    // 22 | assertText | css=vaadin-grid-cell-content:nth-child(54) | Almeria
    assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(46)")).getText(), is("Almeria"));
    // 23 | assertText | css=vaadin-grid-cell-content:nth-child(55) | Worker
    assertThat(driver.findElement(By.cssSelector("vaadin-grid-cell-content:nth-child(47)")).getText(), is("Worker"));
  }
  @Test
  public void InsertFailBlankName() {
	    // Test name: 4.Insert_Fail_BlankName
	    // Step # | name | target | value
	    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
	    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
	    // 2 | click | css=vaadin-button:nth-child(2) | 
	    driver.findElement(By.cssSelector("vaadin-button:nth-child(2)")).click();
	    {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	        try { wait.until(driver -> false); } catch (TimeoutException e) {}
	    }
	    driver.findElement(By.id("input-vaadin-text-field-23")).sendKeys("a");
	    driver.findElement(By.cssSelector("html")).click();
		driver.findElement(By.id("input-vaadin-text-field-23")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		driver.findElement(By.id("input-vaadin-text-field-23")).sendKeys(Keys.DELETE);
		driver.findElement(By.cssSelector("html")).click();
	    // 3 | click | id=input-vaadin-text-field-24 | 
	    driver.findElement(By.id("input-vaadin-text-field-24")).click();
	    // 4 | type | id=input-vaadin-text-field-24 | Gomez
	    driver.findElement(By.id("input-vaadin-text-field-24")).sendKeys("Gomez");
	    // 5 | click | id=input-vaadin-text-field-25 | 
	    driver.findElement(By.id("input-vaadin-text-field-25")).click();
	    // 6 | type | id=input-vaadin-text-field-25 | hola@gmail.com
	    driver.findElement(By.id("input-vaadin-text-field-25")).sendKeys("hola@gmail.com");
	    // 7 | click | id=input-vaadin-text-field-26 | 
	    driver.findElement(By.id("input-vaadin-text-field-26")).click();
	    // 8 | type | id=input-vaadin-text-field-26 | 666666666
	    driver.findElement(By.id("input-vaadin-text-field-26")).sendKeys("666666666");
	    // 9 | click | id=input-vaadin-date-picker-27 | 
	    driver.findElement(By.id("input-vaadin-date-picker-27")).click();
	    // 10 | type | id=input-vaadin-date-picker-27 | 5/6/2000
	    driver.findElement(By.id("input-vaadin-date-picker-27")).sendKeys("5/6/2000");
	    // 11 | click | css=html | 
	    driver.findElement(By.cssSelector("html")).click();
	    // 12 | type | id=input-vaadin-text-field-28 | Almeria
	    driver.findElement(By.id("input-vaadin-text-field-28")).sendKeys("Almeria");
	    // 13 | click | id=input-vaadin-text-field-29 | 
	    driver.findElement(By.id("input-vaadin-text-field-29")).click();
	    // 14 | type | id=input-vaadin-text-field-29 | Worker
	    driver.findElement(By.id("input-vaadin-text-field-29")).sendKeys("Worker");
	    // 15 | click | css=vaadin-button:nth-child(1) | 
	    {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
	        try { wait.until(driver -> false); } catch (TimeoutException e) {}
	    }
	    driver.findElement(By.cssSelector("vaadin-button:nth-child(1)")).click();
	    // 16 | assertText | id=error-message-vaadin-text-field-3 | First name cannot be blank
	    assertThat(driver.findElement(By.id("error-message-vaadin-text-field-3")).getText(), is("First name cannot be blank"));
	  }
  @Test
  public void InsertFailBlankLastName() {
    // Test name: 5.Insert_Fail_BlankLastName
    // Step # | name | target | value
    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
    // 2 | click | css=vaadin-button:nth-child(2) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(2)")).click();
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    // 3 | type | id=input-vaadin-text-field-23 | Pablo
    driver.findElement(By.id("input-vaadin-text-field-23")).sendKeys("Pablo");
    // 4 | click | id=input-vaadin-text-field-25 | 
    driver.findElement(By.id("input-vaadin-text-field-24")).sendKeys("a");
    driver.findElement(By.cssSelector("html")).click();
	driver.findElement(By.id("input-vaadin-text-field-24")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
	driver.findElement(By.id("input-vaadin-text-field-24")).sendKeys(Keys.DELETE);
	driver.findElement(By.cssSelector("html")).click();
    driver.findElement(By.id("input-vaadin-text-field-25")).click();
    // 5 | type | id=input-vaadin-text-field-25 | hola@gmail.com
    driver.findElement(By.id("input-vaadin-text-field-25")).sendKeys("hola@gmail.com");
    // 6 | click | id=input-vaadin-text-field-26 | 
    driver.findElement(By.id("input-vaadin-text-field-26")).click();
    // 7 | type | id=input-vaadin-text-field-26 | 666666666
    driver.findElement(By.id("input-vaadin-text-field-26")).sendKeys("666666666");
    // 8 | click | id=input-vaadin-date-picker-27 | 
    driver.findElement(By.id("input-vaadin-date-picker-27")).click();
    // 9 | type | id=input-vaadin-date-picker-27 | 5/6/2000
    driver.findElement(By.id("input-vaadin-date-picker-27")).sendKeys("5/6/2000");
    // 10 | click | css=html | 
    driver.findElement(By.cssSelector("html")).click();
    // 11 | type | id=input-vaadin-text-field-28 | Almeria
    driver.findElement(By.id("input-vaadin-text-field-28")).sendKeys("Almeria");
    // 12 | type | id=input-vaadin-text-field-29 | Worker
    driver.findElement(By.id("input-vaadin-text-field-29")).sendKeys("Worker");
    // 13 | click | css=vaadin-button:nth-child(1) | 
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    driver.findElement(By.cssSelector("vaadin-button:nth-child(1)")).click();
    // 14 | assertText | id=error-message-vaadin-text-field-6 | Last name cannot be blank
    assertThat(driver.findElement(By.id("error-message-vaadin-text-field-6")).getText(), is("Last name cannot be blank"));
  }
  @Test
  public void InsertFailBlankMail() {
    // Test name: 6.Insert_Fail_BlankMail
    // Step # | name | target | value
    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
    // 2 | click | css=vaadin-button:nth-child(2) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(2)")).click();
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    // 3 | type | id=input-vaadin-text-field-23 | Pablo
    driver.findElement(By.id("input-vaadin-text-field-23")).sendKeys("Pablo");
    // 4 | click | id=input-vaadin-text-field-24 | 
    driver.findElement(By.id("input-vaadin-text-field-24")).click();
    // 5 | type | id=input-vaadin-text-field-24 | Gomez
    driver.findElement(By.id("input-vaadin-text-field-24")).sendKeys("Gomez");
    // 6 | click | id=input-vaadin-text-field-26 | 
    driver.findElement(By.id("input-vaadin-text-field-25")).sendKeys("a");
    driver.findElement(By.cssSelector("html")).click();
	driver.findElement(By.id("input-vaadin-text-field-25")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
	driver.findElement(By.id("input-vaadin-text-field-25")).sendKeys(Keys.DELETE);
	driver.findElement(By.cssSelector("html")).click();
    driver.findElement(By.id("input-vaadin-text-field-26")).click();
    // 7 | type | id=input-vaadin-text-field-26 | 666666666
    driver.findElement(By.id("input-vaadin-text-field-26")).sendKeys("666666666");
    // 8 | type | id=input-vaadin-date-picker-27 | 5/6/2000
    driver.findElement(By.id("input-vaadin-date-picker-27")).sendKeys("5/6/2000");
    // 9 | click | css=html | 
    driver.findElement(By.cssSelector("html")).click();
    // 10 | type | id=input-vaadin-text-field-28 | Almeria
    driver.findElement(By.id("input-vaadin-text-field-28")).sendKeys("Almeria");
    // 11 | click | id=input-vaadin-text-field-29 | 
    driver.findElement(By.id("input-vaadin-text-field-29")).click();
    // 12 | type | id=input-vaadin-text-field-29 | Worker
    driver.findElement(By.id("input-vaadin-text-field-29")).sendKeys("Worker");
    // 13 | click | css=vaadin-button:nth-child(1) | 
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    driver.findElement(By.cssSelector("vaadin-button:nth-child(1)")).click();
    // 14 | assertText | id=error-message-vaadin-text-field-9 | Email cannot be blank
    assertThat(driver.findElement(By.id("error-message-vaadin-text-field-9")).getText(), is("Email cannot be blank"));
  }
  @Test
  public void InsertFailWrongMail() {
    // Test name: 7.Insert_Fail_WrongMail
    // Step # | name | target | value
    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
    // 2 | click | css=vaadin-button:nth-child(2) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(2)")).click();
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    // 3 | type | id=input-vaadin-text-field-23 | Pablo
    driver.findElement(By.id("input-vaadin-text-field-23")).sendKeys("Pablo");
    // 4 | click | id=input-vaadin-text-field-24 | 
    driver.findElement(By.id("input-vaadin-text-field-24")).click();
    // 5 | type | id=input-vaadin-text-field-24 | Gomez
    driver.findElement(By.id("input-vaadin-text-field-24")).sendKeys("Gomez");
    // 6 | click | id=input-vaadin-text-field-25 | 
    driver.findElement(By.id("input-vaadin-text-field-25")).click();
    // 7 | type | id=input-vaadin-text-field-25 | holaquepasa
    driver.findElement(By.id("input-vaadin-text-field-25")).sendKeys("holaquepasa");
    // 8 | click | id=input-vaadin-text-field-26 | 
    driver.findElement(By.id("input-vaadin-text-field-26")).click();
    // 9 | type | id=input-vaadin-text-field-26 | 666666666
    driver.findElement(By.id("input-vaadin-text-field-26")).sendKeys("666666666");
    // 10 | click | id=input-vaadin-date-picker-27 | 
    driver.findElement(By.id("input-vaadin-date-picker-27")).click();
    // 11 | type | id=input-vaadin-date-picker-27 | 5/6/2000
    driver.findElement(By.id("input-vaadin-date-picker-27")).sendKeys("5/6/2000");
    // 12 | click | css=html | 
    driver.findElement(By.cssSelector("html")).click();
    // 13 | type | id=input-vaadin-text-field-28 | Almeria
    driver.findElement(By.id("input-vaadin-text-field-28")).sendKeys("Almeria");
    // 14 | click | id=input-vaadin-text-field-29 | 
    driver.findElement(By.id("input-vaadin-text-field-29")).click();
    // 15 | type | id=input-vaadin-text-field-29 | Worker
    driver.findElement(By.id("input-vaadin-text-field-29")).sendKeys("Worker");
    // 16 | click | css=vaadin-button:nth-child(1) | 
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    driver.findElement(By.cssSelector("vaadin-button:nth-child(1)")).click();
    // 17 | assertText | id=error-message-vaadin-text-field-9 | must be a well-formed email address
    assertThat(driver.findElement(By.id("error-message-vaadin-text-field-9")).getText(), is("must be a well-formed email address"));
  }
  @Test
  public void InsertFailBlankPhone() {
    // Test name: 8.Insert_Fail_BlankPhone
    // Step # | name | target | value
    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
    // 2 | click | css=vaadin-button:nth-child(2) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(2)")).click();
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    // 3 | type | id=input-vaadin-text-field-23 | Pablo
    driver.findElement(By.id("input-vaadin-text-field-23")).sendKeys("Pablo");
    // 4 | click | id=input-vaadin-text-field-24 | 
    driver.findElement(By.id("input-vaadin-text-field-24")).click();
    // 5 | type | id=input-vaadin-text-field-24 | Gomez
    driver.findElement(By.id("input-vaadin-text-field-24")).sendKeys("Gomez");
    // 6 | click | id=input-vaadin-text-field-25 | 
    driver.findElement(By.id("input-vaadin-text-field-25")).click();
    // 7 | type | id=input-vaadin-text-field-25 | hola@gmail.com
    driver.findElement(By.id("input-vaadin-text-field-25")).sendKeys("hola@gmail.com");
    driver.findElement(By.id("input-vaadin-text-field-26")).sendKeys("a");
    driver.findElement(By.cssSelector("html")).click();
	driver.findElement(By.id("input-vaadin-text-field-26")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
	driver.findElement(By.id("input-vaadin-text-field-26")).sendKeys(Keys.DELETE);
	driver.findElement(By.cssSelector("html")).click();
    // 8 | click | id=input-vaadin-date-picker-27 | 
    driver.findElement(By.id("input-vaadin-date-picker-27")).click();
    // 9 | type | id=input-vaadin-date-picker-27 | 5/6/2000
    driver.findElement(By.id("input-vaadin-date-picker-27")).sendKeys("5/6/2000");
    // 10 | click | css=html | 
    driver.findElement(By.cssSelector("html")).click();
    // 11 | type | id=input-vaadin-text-field-28 | Almeria
    driver.findElement(By.id("input-vaadin-text-field-28")).sendKeys("Almeria");
    // 12 | click | id=input-vaadin-text-field-29 | 
    driver.findElement(By.id("input-vaadin-text-field-29")).click();
    // 13 | type | id=input-vaadin-text-field-29 | Worker
    driver.findElement(By.id("input-vaadin-text-field-29")).sendKeys("Worker");
    // 14 | click | css=vaadin-button:nth-child(1) | 
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    driver.findElement(By.cssSelector("vaadin-button:nth-child(1)")).click();
    // 15 | assertText | id=error-message-vaadin-text-field-12 | Phone cannot be blank
    assertThat(driver.findElement(By.id("error-message-vaadin-text-field-12")).getText(), is("Phone cannot be blank"));
  }
  @Test
  public void InsertFailBlankDate() {
    // Test name: 9.Insert_Fail_BlankDate
    // Step # | name | target | value
    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    // 2 | click | css=vaadin-button:nth-child(2) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(2)")).click();
    // 3 | type | id=input-vaadin-text-field-23 | Pablo
    driver.findElement(By.id("input-vaadin-text-field-23")).sendKeys("Pablo");
    // 4 | click | id=input-vaadin-text-field-24 | 
    driver.findElement(By.id("input-vaadin-text-field-24")).click();
    // 5 | type | id=input-vaadin-text-field-24 | Gomez
    driver.findElement(By.id("input-vaadin-text-field-24")).sendKeys("Gomez");
    // 6 | click | id=input-vaadin-text-field-25 | 
    driver.findElement(By.id("input-vaadin-text-field-25")).click();
    // 7 | type | id=input-vaadin-text-field-25 | hola@gmail.com
    driver.findElement(By.id("input-vaadin-text-field-25")).sendKeys("hola@gmail.com");
    // 8 | click | id=input-vaadin-text-field-26 | 
    driver.findElement(By.id("input-vaadin-text-field-26")).click();
    // 9 | type | id=input-vaadin-text-field-26 | 666666666
    driver.findElement(By.id("input-vaadin-text-field-26")).sendKeys("666666666");
    driver.findElement(By.id("input-vaadin-date-picker-27")).sendKeys("a");
    driver.findElement(By.cssSelector("html")).click();
	driver.findElement(By.id("input-vaadin-date-picker-27")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
	driver.findElement(By.id("input-vaadin-date-picker-27")).sendKeys(Keys.DELETE);
	driver.findElement(By.cssSelector("html")).click();
    // 10 | click | id=input-vaadin-text-field-28 | 
    driver.findElement(By.id("input-vaadin-text-field-28")).click();
    // 11 | type | id=input-vaadin-text-field-28 | Almeria
    driver.findElement(By.id("input-vaadin-text-field-28")).sendKeys("Almeria");
    // 12 | click | id=input-vaadin-text-field-29 | 
    driver.findElement(By.id("input-vaadin-text-field-29")).click();
    // 13 | type | id=input-vaadin-text-field-29 | Worker
    driver.findElement(By.id("input-vaadin-text-field-29")).sendKeys("Worker");
    // 14 | click | css=vaadin-button:nth-child(1) | 
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    driver.findElement(By.cssSelector("vaadin-button:nth-child(1)")).click();
    // 15 | assertText | id=error-message-vaadin-date-picker-15 | Date cannot be blank
    assertThat(driver.findElement(By.id("error-message-vaadin-date-picker-15")).getText(), is("Date cannot be blank"));
  }
  @Test
  public void InsertFailBlankOccupation() {
    // Test name: 10.Insert_Fail_BlankOccupation
    // Step # | name | target | value
    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
    // 2 | click | css=vaadin-button:nth-child(2) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(2)")).click();
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    // 3 | type | id=input-vaadin-text-field-23 | Pablo
    driver.findElement(By.id("input-vaadin-text-field-23")).sendKeys("Pablo");
    // 4 | click | id=input-vaadin-text-field-24 | 
    driver.findElement(By.id("input-vaadin-text-field-24")).click();
    // 5 | type | id=input-vaadin-text-field-24 | Gomez
    driver.findElement(By.id("input-vaadin-text-field-24")).sendKeys("Gomez");
    // 6 | click | id=input-vaadin-text-field-25 | 
    driver.findElement(By.id("input-vaadin-text-field-25")).click();
    // 7 | type | id=input-vaadin-text-field-25 | hola@gmail.com
    driver.findElement(By.id("input-vaadin-text-field-25")).sendKeys("hola@gmail.com");
    // 8 | click | id=input-vaadin-text-field-26 | 
    driver.findElement(By.id("input-vaadin-text-field-26")).click();
    // 9 | type | id=input-vaadin-text-field-26 | 666666666
    driver.findElement(By.id("input-vaadin-text-field-26")).sendKeys("666666666");
    // 10 | click | id=input-vaadin-date-picker-27 | 
    driver.findElement(By.id("input-vaadin-date-picker-27")).click();
    // 11 | type | id=input-vaadin-date-picker-27 | 5/6/2000
    driver.findElement(By.id("input-vaadin-date-picker-27")).sendKeys("5/6/2000");
    driver.findElement(By.id("input-vaadin-text-field-28")).sendKeys("a");
    driver.findElement(By.cssSelector("html")).click();
	driver.findElement(By.id("input-vaadin-text-field-28")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
	driver.findElement(By.id("input-vaadin-text-field-28")).sendKeys(Keys.DELETE);
	driver.findElement(By.cssSelector("html")).click();
    // 12 | click | css=html | 
    driver.findElement(By.cssSelector("html")).click();
    // 13 | type | id=input-vaadin-text-field-29 | Worker
    driver.findElement(By.id("input-vaadin-text-field-29")).sendKeys("Worker");
    // 14 | click | css=vaadin-button:nth-child(1) | 
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    driver.findElement(By.cssSelector("vaadin-button:nth-child(1)")).click();
    // 15 | assertText | id=error-message-vaadin-text-field-18 | Occupation cannot be blank
    assertThat(driver.findElement(By.id("error-message-vaadin-text-field-18")).getText(), is("Occupation cannot be blank"));
  }
  @Test
  public void InsertFailBlankRole() {
    // Test name: 11.Insert_Fail_BlankRole
    // Step # | name | target | value
    // 1 | open | https://my-app-1715855750474.azurewebsites.net/login | 
    driver.get("https://my-app-1715855750474.azurewebsites.net/login");
    // 2 | click | css=vaadin-button:nth-child(2) | 
    driver.findElement(By.cssSelector("vaadin-button:nth-child(2)")).click();
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    // 3 | type | id=input-vaadin-text-field-23 | Pablo
    driver.findElement(By.id("input-vaadin-text-field-23")).sendKeys("Pablo");
    // 4 | click | id=input-vaadin-text-field-24 | 
    driver.findElement(By.id("input-vaadin-text-field-24")).click();
    // 5 | type | id=input-vaadin-text-field-24 | Gomez
    driver.findElement(By.id("input-vaadin-text-field-24")).sendKeys("Gomez");
    // 6 | click | id=input-vaadin-text-field-25 | 
    driver.findElement(By.id("input-vaadin-text-field-25")).click();
    // 7 | type | id=input-vaadin-text-field-25 | hola@gmail.com
    driver.findElement(By.id("input-vaadin-text-field-25")).sendKeys("hola@gmail.com");
    // 8 | click | id=input-vaadin-text-field-26 | 
    driver.findElement(By.id("input-vaadin-text-field-26")).click();
    // 9 | type | id=input-vaadin-text-field-26 | 666666666
    driver.findElement(By.id("input-vaadin-text-field-26")).sendKeys("666666666");
    // 10 | click | id=input-vaadin-date-picker-27 | 
    driver.findElement(By.id("input-vaadin-date-picker-27")).click();
    // 11 | type | id=input-vaadin-date-picker-27 | 5/6/2000
    driver.findElement(By.id("input-vaadin-date-picker-27")).sendKeys("5/6/2000");
    // 12 | click | css=html | 
    driver.findElement(By.cssSelector("html")).click();
    // 13 | type | id=input-vaadin-text-field-28 | Almeria
    driver.findElement(By.id("input-vaadin-text-field-28")).sendKeys("Almeria");
    driver.findElement(By.id("input-vaadin-text-field-29")).sendKeys("a");
    driver.findElement(By.cssSelector("html")).click();
	driver.findElement(By.id("input-vaadin-text-field-29")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
	driver.findElement(By.id("input-vaadin-text-field-29")).sendKeys(Keys.DELETE);
	driver.findElement(By.cssSelector("html")).click();
    // 14 | click | css=vaadin-button:nth-child(1) | 
	{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try { wait.until(driver -> false); } catch (TimeoutException e) {}
    }
    driver.findElement(By.cssSelector("vaadin-button:nth-child(1)")).click();
    // 15 | assertText | id=error-message-vaadin-text-field-21 | Role cannot be blank
    assertThat(driver.findElement(By.id("error-message-vaadin-text-field-21")).getText(), is("Role cannot be blank"));
  }
}