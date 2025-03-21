package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.DriverFactory;

public class LoginPageStepDefinitions {
    private static final Logger log = LoggerFactory.getLogger(LoginPageStepDefinitions.class);
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User at login page")
    public void userAtLoginPage() {
        loginPage.userAtLoginPage();
    }

    @When("Click login button wout fulfilling username and password")
    public void clickLoginButtonWoutFulfillingUsernameAndPassword() {
        loginPage.clickLogin();
    }

    @Then("Check {string} message about username")
    public void checkMessageAboutUsername(String username) {
        loginPage.checkMessage(username);
    }

    @When("Write {string} for username field")
    public void writeForUsernameField(String user) {
        loginPage.writeUsernameForUsernameField(user);
    }

    @Then("Check {string} message about password")
    public void checkMessageAboutPassword(String error) {
        loginPage.checkMessage(error);
    }

    @When("Write {string} for password field")
    public void writeForPasswordField(String password) {
        loginPage.writePasswordForPasswordField(password);
    }

    @When("Write Correct {string} for username field")
    public void writeCorrectForUsernameField(String correctUser) {
        loginPage.correctUsername(correctUser);
    }

    @When("Write False {string} for password field")
    public void writeFalseForPasswordField(String falsePass) {
        loginPage.falsePassword(falsePass);
    }

    @Then("Check {string} message about missmatch")
    public void checkMessageAboutMissmatch(String missMatch) {
        loginPage.missMatchMessage(missMatch);
    }

    @When("Write False {string} for username field")
    public void writeFalseForUsernameField(String falseUser) {
        loginPage.falseUsername(falseUser);
    }

    @When("Write Correct {string} for password field")
    public void writeCorrectForPasswordField(String correctPass) {
        loginPage.correctPassword(correctPass);
    }

    @Then("Check successful login")
    public void checkSuccessfulLogin() {
        loginPage.checkSuccess();
    }
}
