import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class HomeWorkChallenge {

    //1
    /**
     * 1.Press an element using JavaScript code (from inside your
     * Java code)
     * HINT: read on JavaScriptExecutor interface.
     */

    private static ChromeDriver chromeDriver;

    @Test
    public void test_press_JavaScript() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.bing.com/hp?mkt=us-eN");

        WebElement element = chromeDriver.findElement(By.id("scpl5"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].click();", element);
    }

    @AfterClass
    public void afterAll() {
        chromeDriver.quit();
    }

    //2
    /**Is running tests on multiple browsers in parallel is
     possible? Which tool can be used for it? */

    // Selenium Grid: Allows you to run tests on multiple browsers and operating systems simultaneously
}

