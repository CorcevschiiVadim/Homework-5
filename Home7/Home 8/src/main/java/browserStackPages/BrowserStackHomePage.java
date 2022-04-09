package browserStackPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserStackHomePage {
       WebDriver driver;
       By Header = By.xpath("//h1");
       By getsStarted = By.xpath("//*[@id='signupModalButton']");
    private By getStarted;

    public BrowserStackHomePage(WebDriver driver) {
           this.driver = driver;
       }
       
       public void veryHeader() {
           String getheadertext = driver.findElement(Header).getText();
       }

    private void assertEquals(String s, String getheadertext) {
        assertEquals("App & Browser Testing Made Easy", getheadertext);
       }
       
       public void clickOnGetStarted() {
           driver.findElement(getStarted).click();
       }
}
