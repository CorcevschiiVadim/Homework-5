package browserStackPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackHomePage {
    WebDriver driver;
    @FindBy(xpath="//h1")
    WebElement Header;
    @FindBy(xpath="//*[@id='signupModalButton']")
    WebElement getsStarted;
    private WebElement getStarted;

    public BrowserStackHomePage(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void veryHeader() {
        
       String getheadertext = Header.getText();
    }

    private void assertEquals(String s, String getheadertext) {
        assertEquals("App & Browser Testing Made Easy", getheadertext);
    }

    public void clickOnGetStarted() {
        getStarted.click();
    }
}
