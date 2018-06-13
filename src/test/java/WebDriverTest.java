/*
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class WebDriverTest {
    WebDriver driver;

    @BeforeMethod
    public void init() {
        System.setProperty ( "webdriver.gecko.driver" , "\\Program Files\\Geckodriver\\geckodriver.exe" );
        driver = new FirefoxDriver ();
        driver.manage ().timeouts ().implicitlyWait ( 15 , TimeUnit.SECONDS );
    }

    @Test
    public void selWebDriver1 ( ) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait ( driver , 30 );


        driver.get ( "https://www.mail.ru" );
        WebElement loginField = driver.findElement ( By.id ( "mailbox:login" ) );

        loginField.sendKeys ( "ivanivanovbyn" );
        WebElement passwordField = driver.findElement ( By.id ( "mailbox:password" ) );
        passwordField.sendKeys ( "ryblevka7" );
        WebElement loginButton = driver.findElement ( By.xpath ( "/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form/div[2]/div[2]/label/input" ) );
        loginButton.click ();


        */
/*WebElement loginAssert = driver.findElement (By.cssSelector ("#PH_user-email"));
        String loginUser = loginAssert.getText();
        Assert.assertEquals ("ivanivanovbyn@mail.ru", loginUser);*//*



        WebElement newLetter = driver.findElement ( By.cssSelector ( "a.b-toolbar__btn > span:nth-child(2)" ) );
        WebElement element   = wait.until ( ExpectedConditions.presenceOfElementLocated ( By.cssSelector ( "a.b-toolbar__btn > span:nth-child(2)" ) ));
        newLetter.click ();


        WebElement newLetterToWhome = driver.findElement ( By.xpath ( "/html/body/div[3]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div[1]/div/div/div[2]/div/div/div/textarea[2]" ) );

        newLetterToWhome.sendKeys ( "ttp@gmail.com" );


        WebElement newLetterTopic = driver.findElement ( By.xpath ( "/html/body/div[3]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div[4]/div/div/div[2]/div/input" ) );
        newLetterTopic.sendKeys ( "privet, dryza" );

        WebElement newLetterDraft = driver.findElement ( By.xpath ( "/html/body/div[3]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[1]/div/div[2]/div/div[3]/div/div[2]/div[2]/div/div[1]" ) );
        WebElement newLetterDraft2 = wait.until ( ExpectedConditions.visibilityOfElementLocated ( By.xpath ( "/html/body/div[3]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[1]/div/div[2]/div/div[3]/div/div[2]/div[2]/div/div[1]" ) ));
        newLetterDraft2.click ();


        WebElement gotoDrafts = driver.findElement ( By.cssSelector ( "div.b-nav__item:nth-child(3)" ) );
        WebElement gotoDrafts2 = wait.until ( ExpectedConditions.visibilityOfElementLocated ( By.cssSelector ( "div.b-nav__item:nth-child(3)" ) ));
        //driver.manage ().timeouts ().implicitlyWait ( 10 , TimeUnit.SECONDS );
        gotoDrafts2.click ();


        //WebElement findLetterInDrafts = driver.findElement ( By.cssSelector ( ".b-datalist_letters_to > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(2)" ) );
        WebElement findLetterInDraftsWait = wait.until ( ExpectedConditions.elementToBeClickable ( By.cssSelector ( ".b-datalist_letters_to > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1) > div:nth-child(4) > div:nth-child(3) > div:nth-child(2)" ) ));
        findLetterInDraftsWait.click ();

        //WebElement fillLetterFind = driver.findElement (By.xpath ( "//*[@id='tinymce']//div[contains(@id,'style')]/div/br" ) );
        WebElement fillLetter = wait.until ( ExpectedConditions.presenceOfElementLocated ( By.xpath ( "//*[@id='tinymce']//div[contains(@id,'style')]/div/br" ) ) );
        fillLetter.sendKeys ( "1256863542432" );
        fillLetter.click ();

        WebElement sendLetter = driver.findElement ( By.cssSelector ( "div.b-toolbar__item_:nth-child(1) > div:nth-child(1) > span:nth-child(1)" ) );
        WebElement element2   = wait.until ( ExpectedConditions.elementToBeClickable ( By.cssSelector ( "div.b-toolbar__item_:nth-child(1) > div:nth-child(1) > span:nth-child(1)" ) ) );
        sendLetter.click ();

        WebElement gotoSentLetter = driver.findElement ( By.xpath ( "/html/body/div[3]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[1]/div[1]/div/div[2]/a/span" ) );
        gotoSentLetter.click ();

        WebElement goOutBox = driver.findElement ( By.xpath ( "//*[@id=\"PH_logoutLink\"]" ) );
        goOutBox.click ();

    }

    @AfterMethod
    public void tearDown ( ) {
        driver.close();
    }
}

*/
