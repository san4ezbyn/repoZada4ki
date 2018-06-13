package company;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;


public class WebDriverTest2 {

    private WebDriver     driver;
    private WebDriverWait wait;

    final static private String PLACEHOLDER  = "webdriver.chrome.driver";//"webdriver.gecko.driver";
    //final static private String PATH         = "C:\\Program Files\\Geckodriver\\geckodriver.exe";
    final static private String PATH         = "C:\\Program Files\\ChromeDriver\\chromedriver.exe";
    final static private String URL          = "https://yandex.by/";
    final static private String LOGINNAME    = "ivanivanovbyn";
    final static private String PASSWRDVALUE = "borisov18";
    final static private String RECEIVER     = "ooo@tut.by";
    final static private String BODYTEXT     = "What is Lorem Ipsum?\n";
    final static private int    TIME_OUT     = 60;
    private static       String topic        = String.format ( "№- %s" , new Random ().nextInt ( 10000 ) );

    @BeforeClass
    public void init ( ) {
        System.setProperty ( PLACEHOLDER , PATH );
        //driver = new FirefoxDriver ();
        driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        wait = new WebDriverWait ( driver , TIME_OUT );
        driver.get ( URL );
    }

    @Test
    public void logIn ( ) {

        WebElement enterMail = driver.findElement ( By.cssSelector ( ".desk-notif-card__login-enter-expanded" ) );
        enterMail.click ();

        WebElement loginField = driver.findElement ( By.cssSelector ( "div.passport-Domik-Form-Field:nth-child(10) > label:nth-child(1) > input:nth-child(1)" ) );
        loginField.sendKeys ( LOGINNAME );

        WebElement passwordField = driver.findElement ( By.cssSelector ( "div.passport-Domik-Form-Field:nth-child(11) > label:nth-child(1) > input:nth-child(1)" ) );
        passwordField.sendKeys ( PASSWRDVALUE );

        WebElement loginButtonEnter = driver.findElement ( By.cssSelector ( "button.passport-Button:nth-child(1)" ) );
        loginButtonEnter.click ();

        WebElement loginTrue = wait.until ( ExpectedConditions.visibilityOfElementLocated ( By.cssSelector ( ".mail-User-Name" ) ) );
//        TODO fix me (проверка на правильный логин)
        Assert.assertEquals ( loginTrue.getText () , "ivanivanovbyn" );
    }

    @Test(dependsOnMethods = "logIn")
    public void writeLetter ( ) {

        WebElement newLetter = wait.until ( ExpectedConditions.presenceOfElementLocated ( By.cssSelector ( ".mail-ComposeButton-Text" ) ) );
        Assert.assertTrue ( newLetter.getText ().contains ( "Написать" ) );
        newLetter.click ();

        WebElement newLetterToWhome = wait.until ( ExpectedConditions.visibilityOfElementLocated ( By.cssSelector ( ".mail-Compose-Field_to > div:nth-child(3) > div:nth-child(1)" ) ) );
        newLetterToWhome.sendKeys ( RECEIVER );

        WebElement newLetterTopic = driver.findElement ( By.cssSelector ( "input.mail-Compose-Field-Input-Controller" ) );
        newLetterTopic.sendKeys ( topic );

        WebElement bodyLetter = driver.findElement ( By.cssSelector ( ".cke_source" ) );
        bodyLetter.sendKeys ( BODYTEXT );

        WebElement goToDrafts = wait.until ( ExpectedConditions.presenceOfElementLocated ( By.cssSelector ( "a.ns-view-folder:nth-child(5) > span:nth-child(2)" ) ) );
        goToDrafts.click ();

        WebElement clickPopUp = driver.findElement ( By.cssSelector ( "._nb-small-action-button" ) );
        clickPopUp.click ();

        isListOfEmailsDisplayed ( By.xpath ( "//span[@class='mail-MessageSnippet-Item mail-MessageSnippet-Item_subjectWrapper js-message-snippet-subject']" ) , topic );

        Assert.assertTrue ( lettersListing ().matches ( topic ) );
    }

    @Test(dependsOnMethods = "writeLetter")
    public void sendLetter ( ) {
        WebElement sendLetter = wait.until ( ExpectedConditions.visibilityOfElementLocated ( By.xpath ( "//button[@type='submit']" ) ) );
        sendLetter.click ();
        WebElement gotoSentLetters2 = driver.findElement ( By.xpath ( "//a[@href='#sent']" ) );
        gotoSentLetters2.click ();

        Assert.assertTrue ( lettersListing ().matches ( topic ) );
    }

    @AfterClass
    void tearDown ( ) {
        driver.close ();
    }

    private boolean isListOfEmailsDisplayed ( final By emailsBy , final String subject ) {
        return wait.until (
                (ExpectedCondition <Boolean>) driver -> {
                    try {
                        List <WebElement> elements = driver.findElements ( emailsBy );
                        for (WebElement element : elements) {
                            String elementText = element.getText ().trim ();
                            return elementText.equals ( subject );
                        }
                    } catch (StaleElementReferenceException e) {
                        return false;
                    } catch (TimeoutException toe) {
                        return false;
                    }
                    return false;
                }
        );
    }

    private String lettersListing ( ) {
        isListOfEmailsDisplayed ( By.xpath ( "//span[@class='mail-MessageSnippet-Item mail-MessageSnippet-Item_subjectWrapper js-message-snippet-subject']" ) , topic );
        List <WebElement> mailList = driver.findElements ( By.xpath ( "//span[@class='mail-MessageSnippet-Item mail-MessageSnippet-Item_subjectWrapper js-message-snippet-subject']" ) );
        for (WebElement element : mailList) {
            String elementText = element.getText ().trim ();
            if (topic.equals ( elementText )) {
                wait.until ( ExpectedConditions.textToBePresentInElement ( element , topic ) );
                element.click ();
                return elementText;
            }
        }
        return null;
    }

}

