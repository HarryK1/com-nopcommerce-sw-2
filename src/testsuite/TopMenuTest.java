package testsuite;
/**
 * 4. Write down the following test into ‘TopMenuTest’  class
 * 1. userShouldNavigateToComputerPageSuccessfully * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’
 * 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        //enter valid username
        driver.findElement(By.id("Email")).sendKeys("username" + randomInt + "@gmail.com");
        //enter valid password
        driver.findElement(By.id("Password")).sendKeys("tuesday");
        //click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //click on the Computers tab
        driver.findElement(By.xpath("(//a[@href='/computers'])[1]")).click();
        //verify the text Computers
        String expectedDisplay = "Computers";
        String actualDisplay = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display Computers", expectedDisplay, actualDisplay);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //Enter valid username
        driver.findElement(By.id("Email")).sendKeys("tuesday@gmail.com");
        //Enter valid password
        driver.findElement(By.id("Password")).sendKeys("tuesday");
        //Click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //click on the Electronics tab
        driver.findElement(By.xpath("(//a[@href='/electronics' or text()='Electronics'])[1]")).click();
        //verify the text Electronics
        String expectedDisplayElectronics = "Electronics";
        String actualDisplayElectronics = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display Electronics", expectedDisplayElectronics, actualDisplayElectronics);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //enter valid username
        driver.findElement(By.id("Email")).sendKeys("tuesday@gmail.com");
        //enter valid password
        driver.findElement(By.id("Password")).sendKeys("tuesday");
        //click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //click on Apparel tab
        driver.findElement(By.xpath("(//a[@href='/apparel' or text()='Apparel'])[1]")).click();
        //verify the text Apparel
        String expectedDisplayApparel = "Apparel";
        String actualDisplayApparel = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display Apparel", expectedDisplayApparel, actualDisplayApparel);
    }

    @Test
    public void userShouldNavigateToDownloadsPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //enter valid username
        driver.findElement(By.id("Email")).sendKeys("tuesday@gmail.com");
        //enter valid password
        driver.findElement(By.id("Password")).sendKeys("tuesday");
        //click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //click on Digital downloads tab
        driver.findElement(By.xpath("(//a[@href='/digital-downloads' or text()='Digital downloads'])[1]")).click();
        //verify the text Digital downloads
        String expectedDisplay = "Digital downloads";
        String actualDisplay = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display Digital downloads", expectedDisplay, actualDisplay);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //enter valid username
        driver.findElement(By.id("Email")).sendKeys("tuesday@gmail.com");
        //enter valid password
        driver.findElement(By.id("Password")).sendKeys("tuesday");
        //click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //click on Books tab
        driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
        //verify the text Books
        String expectedDisplay = "Books";
        String actualDisplay = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display Books", expectedDisplay, actualDisplay);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //enter valid username
        driver.findElement(By.id("Email")).sendKeys("tuesday@gmail.com");
        //enter valid password
        driver.findElement(By.id("Password")).sendKeys("tuesday");
        //click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //click on Jewelery tab
        driver.findElement(By.xpath("(//a[@href='/jewelry'])[1]")).click();
        //verify the text Jewelery
        String expectedDisplay = "Jewelry";
        String actualDisplay = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Display Jewelery", expectedDisplay, actualDisplay);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //enter valid username
        driver.findElement(By.id("Email")).sendKeys("tuesday@gmail.com");
        //enter valid password
        driver.findElement(By.id("Password")).sendKeys("tuesday");
        //click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //click on Gift Cards tab
        driver.findElement(By.xpath("(//a[@href='/gift-cards'])[1]")).click();
        //verify the text Gift cards
        String expectedDisplay = "Gift Cards";
        String actualDisplay = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("No Gift Cards", expectedDisplay, actualDisplay);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
