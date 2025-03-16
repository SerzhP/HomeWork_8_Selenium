import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork_8 {

    //1

    /**
     * Write a program that does the following:
     * 1. Write a TestNG test that will open the following:
     * a. Chrome – https://www.walla.co.il
     * b. FireFox – https://www.ynet.co.il
     */

    private static ChromeDriver chromeDriver;
    private static FirefoxDriver firefoxDriver;
    private static EdgeDriver edgeDriver;


    @BeforeClass
    public static void beforeAll() {


    }


    @Test
    public void test_01_open_chrome_walla() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.walla.co.il");
        chromeDriver.quit();


    }

    @Test
    public void test_02_open_firefox_ynet() {
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.ynet.co.il");
        firefoxDriver.quit();
    }

    @Test
    public void test_03_open_edge_bing() {
        edgeDriver = new EdgeDriver();
        edgeDriver.get("https://www.bing.com/");
        edgeDriver.quit();
    }

    //2

    /**
     *  Open Chrome browser.
     *  Navigate to Google Translate website:
     * https://translate.google.com/
     *  Find translation box (where you enter text to be
     * translated) using 2 different locators and print the
     * WebElement you created.
     * e.g: System.out.println(driver.findElement...
     */

    @Test
    public void test_04_chrome_translate() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://translate.google.com/");
        System.out.println(chromeDriver.findElement(By.className("er8xn")));
        System.out.println(chromeDriver.findElement(By.tagName("textarea")));
    }
    //3

    /**
     *  Open FireFox browser.
     *  Navigate to youtube: https://www.youtube.com/
     *  Find Youtube button using id locator and print the
     * WebElement you created.
     * e.g. System.out.println(driver.findElement...)
     * Upload your homework code into a Github repository and provide the link
     */

    @Test
    public void test_05_firefox_youtube() {
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.youtube.com/");
        System.out.println(firefoxDriver.findElement(By.id("logo-icon")));
    }

    //4

    /**
     *  Open FireFox browser.
     *  Navigate to selenium website:
     * http://www.seleniumhq.org/
     *  Find the search text field using name locator and print
     * the WebElement you created.
     * e.g. System.out.println(driver.findElement...)
     *  Send the word “selenium” to this text box
     */

    @Test
    public void test_06_firefox_selenium() {
        firefoxDriver = new FirefoxDriver();
//        firefoxDriver.get("http://www.seleniumhq.org/");
        firefoxDriver.get("https://www.youtube.com/");
        System.out.println(firefoxDriver.findElement(By.id("logo-icon")));
//        firefoxDriver.findElement(By.name("search_query")).sendKeys("News");
        WebElement searchElement = firefoxDriver.findElement(By.name("search_query"));
        System.out.println(searchElement);
        searchElement.sendKeys("News");
    }
    //5

    /**
     *  Open Chrome browser on Amazon website:
     * https://www.amazon.com/
     *  Assert website title.
     *  Search for “Leather shoes”.
     */

    @Test
    public void test_07_chrome_amazon() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.amazon.com/");
        System.out.println(chromeDriver.getTitle());
        String amazonTitle = "Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(chromeDriver.getTitle(), amazonTitle);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Leather shoes");

    }

    //6

    /**
     * Create a TestNG test with the following:
     *  Open Google Translate web page
     *  Write anything in Hebrew in the text area
     */

    @Test
    public void test_08_chrome_translate() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://translate.google.com/");
        chromeDriver.findElement(By.tagName("textarea")).sendKeys("שלום");


    }

    //7

    /**
     *  Open Youtube web page
     *  Type a name of a song (any)
     *  Click on search.
     */

    @Test
    public void test_09_chrome_youtube_song() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com/");
        chromeDriver.findElement(By.name("search_query")).sendKeys("Yesterday");
        chromeDriver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
    }

    //8

    /**
     *  Open Chrome browser on Facebook website
     * https://www.facebook.com/
     *  Login into Facebook (No need to send me credentials).
     */

    @Test
    public void test_10_chrome_facebook() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.facebook.com/");
        chromeDriver.findElement(By.id("email")).sendKeys("Serzh");
        chromeDriver.findElement(By.id("pass")).sendKeys("Password");


    }

    @AfterClass
    public void afterAll() {
        chromeDriver.quit();
        firefoxDriver.quit();


    }
}
