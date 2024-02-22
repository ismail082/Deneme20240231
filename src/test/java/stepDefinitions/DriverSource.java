package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public enum DriverSource {
    //only one instance
    INSTANCE;
    private WebDriver driver;
    private ChromeOptions options = new ChromeOptions();

    public WebDriver getDriver() {
        if(driver == null) {
            options.addArguments("--headless"); //Headlees argumani eklendi
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}