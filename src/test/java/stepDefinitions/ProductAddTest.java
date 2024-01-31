package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductAddTest extends BaseTest {

    @Given("User is on login product page")
    public void user_is_on_login_product_page() {
        driver.get("https://www.saucedemo.com/");

    }

    @When("User enters valid username")
    public void user_enters_valid_username() {
        WebElement userNameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        userNameInput.sendKeys("standard_user");
    }

    @And("User enters valid password")
    public void user_enters_valid_password() {
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");

    }

    @When("User login click")
    public void user_login_click() {
        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
    }

    @When("User clicks shoping card button")
    public void user_clicks_shoping_card_button() {
        WebElement loginProduct = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        loginProduct.click();
        WebElement loginProduct1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        loginProduct1.click();
        WebElement loginProduct2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
        loginProduct2.click();
        WebElement loginProduct3 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        loginProduct3.click();
        WebElement loginProduct4 = driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
        loginProduct4.click();
        WebElement loginProduct5 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        loginProduct5.click();
        WebElement shopingcard = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        shopingcard.click();







        }



    @When("User clicks chekout button")
    public void user_clicks_chekout_button() {
        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        WebElement userName = driver.findElement(By.xpath("//input[@id='first-name']"));
        userName.sendKeys("Ismail");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("Bakir");
        WebElement PostaKodu = driver.findElement(By.xpath("//input[@id='postal-code']"));
        PostaKodu.sendKeys("21323");

    }

    @When("User clicks continue button")
    public void user_clicks_continue_button() {
        WebElement devam = driver.findElement(By.xpath("//input[@id='continue']"));
        devam.click();
    }

    @Then("User should successfully item total valid the system")
    public void user_should_successfully_item_total_valid_the_system() {


        WebElement itemTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));

        String actualItemTotal = itemTotal.getText();

        String expectedItemTotal = "$129.94";

        double actualNumericValue = Double.parseDouble(actualItemTotal.replaceAll("[^0-9.]", ""));
        double expectedNumericValue = Double.parseDouble(expectedItemTotal.replaceAll("[^0-9.]", ""));

        Assert.assertEquals(actualNumericValue, expectedNumericValue, 0.01);
        System.out.println(expectedItemTotal);

        System.out.println("Test Basarili Tebrikler");

    }


}



