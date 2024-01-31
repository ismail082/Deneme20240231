package stepDefinitions;

import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver;

    public BaseTest() {
        this.driver = DriverSource.INSTANCE.getDriver();
    }
}
