package co.com.choucair.certification.financial.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletesDataPage extends PageObject {

    public static final Target INPUT_FIRSTNAME = Target.the("where we write the first name").
            located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Where we write the last name").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Where we write the email").
            located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where you select the month").
            located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("where you select the day").
            located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("where you select the year").
            located(By.id("birthYear"));
    public static final Target ENTER_BUTTONNEXTLOCATION = Target.the("select button next location button to continue").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
    public static final Target SELECT_CITY = Target.the("Select the city").
            located(By.id("city"));
    public static final Target INPUT_POSTALCODE = Target.the("Enter zip code").
            located(By.id("zip"));
    public static final Target ENTER_BUTTONNEXTDEVICES = Target.the("Select button next Devices").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target SELECT_CLICK_MOBILEDEVICE = Target.the("Click mobile device").
            located(By.xpath("//span[@aria-label= 'Select Brand']"));
    public static final Target INPUT_SELECT_MOBILEDEVICE = Target.the("write mobile device").
            located(By.xpath("//div[text()='Alcatel']"));
    public static final Target SELECT_CLICK_MODEL = Target.the("Click model").
            located(By.xpath("//div[@placeholder= 'Select a Model']"));
    public static final Target INPUT_SELECT_MODEL = Target.the("write model").
            located(By.xpath("//div[text()= 'IDEAL']"));
    public static final Target SELECT_CLICK_OPERATINGSYSTEM = Target.the("Click operating system").
            located(By.xpath("//span[@class = 'ui-select-placeholder text-muted']"));
    public static final Target INPUT_SELECT_OPERATINGSYSTEM = Target.the("write operating system").
            located(By.xpath("//div[text()= 'Android 5.1']"));
    public static final Target ENTER_BUTTONNEXTLASTSTEP = Target.the("Select button next last step").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
    public static final Target INPUT_CREATEPASSWORD = Target.the("write password to create")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("write password to confirm")
            .located(By.id("confirmPassword"));
    public static final Target SELECT_TERMSOFUSE = Target.the("accept terms of use")
            .located(By.xpath("//span[@class = 'checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target SELECT_CODEOFCONDUCT = Target.the("accept code of conduct")
            .located(By.xpath("//span[@ng-class= '{error: userForm.termOfUse.$error.required}']"));
    public static final Target SELECT_PRIVACYSECURITY = Target.the("accept privacy & security policy")
            .located(By.xpath("//span[@ng-class= '{error: userForm.privacySetting.$error.required}']"));
    public static final Target ENTER_BUTTONCOMPLETESETUP = Target.the("Select button complete setup")
            .located(By.id("laddaBtn"));
    public static final Target WELCOM_TOCOMMUNITY = Target.the("Welcome message").
            located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}