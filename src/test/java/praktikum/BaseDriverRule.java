package praktikum;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;
import java.time.Duration;

public class BaseDriverRule extends ExternalResource {
    WebDriver driver;

    @Override
    protected void before() throws Throwable {
        if ("firefox".equals(System.getProperty("browser")))
            setUpFirefox();
        else
            setUpChrome();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    private void setUpChrome() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable
                        (new File("C:\\Yaprakticum\\WebDriver\\bin\\chromedriver-win64\\chromedriver.exe"))
                .build();

        ChromeOptions options = new ChromeOptions()
                .setBinary("C:\\Yaprakticum\\WebDriver\\bin\\chrome-win64\\chrome.exe");

        driver = new ChromeDriver(service, options);
    }

    public void setUpFirefox() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        var service = new GeckoDriverService.Builder()
                .usingDriverExecutable(new File
                        ("C:\\Yaprakticum\\WebDriver\\bin\\geckodriver-v0.33.0-win64\\geckodriver.exe"))
                .build();

        var options = new FirefoxOptions()
                .setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        driver = new FirefoxDriver(service, options);

    }
    @Override
    protected void after() {
        driver.quit();
    }


    public WebDriver getDriver() {
        return driver;
    }
}
