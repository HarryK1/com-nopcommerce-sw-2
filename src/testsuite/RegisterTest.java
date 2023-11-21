package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
 * 5. Write down the following test into ‘RegisterTest’  class
 * 1. userShouldNavigateToRegisterPageSuccessful ly
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully *  click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration
 * completed’
 */
public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //click on the Register link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        //verify the text Register
        String expectedDisplay = "Register";
        String actualDisplay = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display", expectedDisplay, actualDisplay);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on the Register link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        //select gender radio button
        driver.findElement(By.id("gender-male")).click();
        //Enter first name
        driver.findElement(By.id("FirstName")).sendKeys("Jack");
        //Enter last name
        driver.findElement(By.id("LastName")).sendKeys("Button");
        //Select Day Month and Year
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthDay']//option[@value='10']")).click();
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthMonth']//option[@value='8']")).click();
        driver.findElement(By.xpath("//select[@name = 'DateOfBirthYear']//option[@value='1999']")).click();
        //Email email address
        driver.findElement(By.id("Email")).sendKeys("friday@gmail.com");
        //enter password
        driver.findElement(By.id("Password")).sendKeys("friday");
        //enter confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("friday");
        //Click on Register button
        driver.findElement(By.id("register-button")).click();
        //verify the text 'Your registration completed
        String expectedMessage = "Your registration completed";
        String actualMessage = driver.findElement(By.xpath("//div[text()='Your registration completed']")).getText();
        Assert.assertEquals("Your registration completed", expectedMessage, actualMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
