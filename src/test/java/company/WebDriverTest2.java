package company;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

    public class WebDriverTest2 {

        private static WebDriver driver;


        @BeforeMethod
        public void init ( ) {
            System.setProperty ( "webdriver.gecko.driver" , "C:\\Program Files\\Geckodriver\\geckodriver.exe" );
            driver = new FirefoxDriver ();
            driver.manage ().timeouts ().implicitlyWait ( 15 , TimeUnit.SECONDS );

        }

        @Test
        public void selWebDriver1 ( ) throws InterruptedException {

            WebDriverWait wait = new WebDriverWait ( driver , 40 );


            driver.get ( "https://yandex.by/" );


            WebElement enterMail = driver.findElement ( By.cssSelector ( " .desk-notif-card__login-enter-expanded" ) );
            enterMail.click ();


            WebElement loginField = driver.findElement ( By.cssSelector ( "div.passport-Domik-Form-Field:nth-child(10) > label:nth-child(1) > input:nth-child(1)" ) );
            loginField.sendKeys ( "ivanivanovbyn" );

            WebElement passwordField = driver.findElement ( By.cssSelector ( "div.passport-Domik-Form-Field:nth-child(11) > label:nth-child(1) > input:nth-child(1)" ) );
            passwordField.sendKeys ( "borisov18" );

            WebElement loginButtonEnter = driver.findElement ( By.cssSelector ( "button.passport-Button:nth-child(1)" ) );
            loginButtonEnter.click ();


            WebElement loginTrue = driver.findElement ( By.cssSelector ( ".mail-User-Name" ) );
            boolean    bool      = loginTrue.isDisplayed ();
            Assert.assertEquals ( true , bool );

            WebElement newLetter2 = driver.findElement ( By.cssSelector ( ".mail-ComposeButton-Text" ) );
            WebElement newLetter  = wait.until ( ExpectedConditions.presenceOfElementLocated ( By.cssSelector ( ".mail-ComposeButton-Text" ) ) );
            newLetter.click ();

            TimeUnit.SECONDS.sleep ( 20 );

            WebElement newLetterToWhome = wait.until ( ExpectedConditions.presenceOfElementLocated ( By.cssSelector ( ".mail-Compose-Field_to > div:nth-child(3) > div:nth-child(1)" ) ) );
            newLetterToWhome.sendKeys ( "ooo@tut.by" );


            WebElement newLetterTopic = driver.findElement ( By.cssSelector ( "input.mail-Compose-Field-Input-Controller" ) );
            newLetterTopic.sendKeys ( "wwwwwwwww" );

            WebElement fillLetter = wait.until ( ExpectedConditions.visibilityOfElementLocated ( By.cssSelector ( ".cke_wysiwyg_div" ) ) );
            fillLetter.sendKeys ( "What is Lorem Ipsum?\n" );


            WebElement sendLetter = wait.until ( ExpectedConditions.elementToBeClickable ( By.id ( "nb-16" ) ) );
            sendLetter.click ();


            WebElement gotoSentLetter = driver.findElement ( By.cssSelector ( "a.ns-view-folder:nth-child(2) > span:nth-child(2)" ) );
            gotoSentLetter.click ();

            WebElement closeAlert = wait.until ( ExpectedConditions.visibilityOfElementLocated ( By.cssSelector ( "._nb-small-action-button" ) ) );
            closeAlert.click ();


            /*WebElement alertPopup = (new WebDriverWait(driver, 30))
            .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("._nb-small-action-button")));
            driver.switchTo().alert().dismiss();*/


            WebElement goOutBox = driver.findElement ( By.cssSelector ( "#recipient-1" ) );
            goOutBox.click ();

            Thread.sleep ( 40 );
            WebElement goOutBoxMenu = wait.until ( ExpectedConditions.visibilityOfElementLocated ( By.cssSelector ( "div.b-mail-dropdown__item:nth-child(8) > a:nth-child(1)" ) ) );
            goOutBoxMenu.click ();


            try {

                WebElement enterMail2 = driver.findElement ( By.cssSelector ( "a.button" ) );
                wait.until ( ExpectedConditions.elementToBeClickable ( By.cssSelector ( "a.button" ) ) );
                enterMail2.click ();

            } catch (UnhandledAlertException ue) {

                System.out.print ( "Alert-2 took place" );

            }
            try {

                WebElement passwordField2 = driver.findElement ( By.cssSelector ( ".passport-Input-Controller" ) );
                passwordField2.sendKeys ( "borisov18" );

                WebElement loginButtonEnter2 = driver.findElement ( By.cssSelector ( ".passport-Button" ) );
                loginButtonEnter2.click ();
            } catch (NoSuchElementException nsee) {
                System.out.println ( "\nAlert-3 took place" );
            }

            WebElement searchBox = driver.findElement ( By.cssSelector ( ".textinput__control" ) );
            searchBox.sendKeys ("wwwwwwwww");

            WebElement searchClick = driver.findElement ( By.cssSelector ( ".button2" ) );
            searchClick.click ();


            WebElement compareLetter = driver.findElement ( By.xpath ( "/html/body/div[2]/div[3]/div/div[3]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]/div/div[2]/div/div/div/a/div/span[1]/span[2]/span" ) );
            String compareL = compareLetter.getText();
            Assert.assertEquals ( "ivan ivanov" , compareL );

            System.out.print ("Спасибос за внимос! ))");






        }
        @AfterMethod
        void tearDown ( ) {

            driver.close ();


        }

    }




















