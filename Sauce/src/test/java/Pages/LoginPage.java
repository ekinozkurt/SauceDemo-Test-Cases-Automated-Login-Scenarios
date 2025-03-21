package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class LoginPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }
    By loginButton = By.xpath("//input[@id='login-button']");
    By errorMessage = By.xpath("//h3[@data-test='error']");
    By usernameBox = By.xpath("//input[@id='user-name']");
    By passwordBox = By.xpath("//input[@id='password']");
    By productsText = By.xpath("//span[@class='title']");

    public void userAtLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();

    }

    public void checkMessage(String username) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeUsernameForUsernameField(String user) {
        driver.findElement(usernameBox).click();
        elementHelper.sendKey(usernameBox,"ekobaba");
        //driver.findElement(usernameBox).sendKeys("ekobaba");
    }

    public void writePasswordForPasswordField(String password) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox,"123");
    }

    public void correctUsername(String correctUser) {
        driver.findElement(usernameBox).click();
        elementHelper.sendKey(usernameBox,"standard_user");
    }

    public void falsePassword(String falsePass) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox,"1234");
    }

    public void missMatchMessage(String missMatch) {
        elementHelper.checkVisible(errorMessage);
    }

    public void falseUsername(String falseUser) {
        driver.findElement(usernameBox).click();
        elementHelper.sendKey(usernameBox,"ekobaba");
    }

    public void correctPassword(String correctPass) {
        driver.findElement(passwordBox).click();
        elementHelper.sendKey(passwordBox,"secret_sauce");
    }

    public void checkSuccess() {
        elementHelper.checkVisible(productsText);
    }
}
