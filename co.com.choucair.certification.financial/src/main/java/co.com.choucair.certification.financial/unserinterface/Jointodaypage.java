package co.com.choucair.certification.financial.unserinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Jointodaypage extends PageObject {
    public static final Target ACCESS_BUTTON = Target.the("button that shows us the form to create user")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_FIRSTNAME = Target.the("where we write the first name")
            .located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target INPUT_LASTNAME = Target.the("Where we write the last name")
            .located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target INPUT_EMAIL = Target.the("Where we write the email")
            .located(By.xpath("//*[@id=\"email\"]"));
    public static final Target SELECT_MONTH = Target.the("where you select the month")
            .located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target SELECT_DAY = Target.the("where you select the day")
            .located(By.xpath("//*[@id=\"birthDay\"]"));
    public static final Target SELECT_YEAR = Target.the("where you select the year")
            .located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target ENTER_BUTTONNEXTLOCATION = Target.the("select button next location button to continue")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target SELECT_CITY = Target.the("Select the city")
            .located(By.xpath("//*[@id=\"city\"]"));
    public static final Target INPUT_POSTALCODE = Target.the("Enter zip code")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[3]/input"));
    public static final Target SELECT_COUNTRY = Target.the("Select the country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target ENTER_BUTTONNEXTDEVICES = Target.the("Select button next Devices")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target SELECT_COMPUTER = Target.the("Select computer brand")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target SELECT_VERSION = Target.the("Select the computer version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[2]"));
    public static final Target SELECT_LANGUAGE = Target.the("Select computer language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target SELECT_CLICK_MOBILEDEVICE = Target.the("Click mobile device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target SELECT_MOBILEDEVICE = Target.the("select mobile device")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-8-1\"]/span"));
    public static final Target SELECT_MODEL = Target.the("select model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target SELECT_OPERATINGSYSTEM = Target.the("select operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target ENTER_BUTTONNEXTLASTSTEP = Target.the("Select button next last step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_CREATEPASSWORD = Target.the("write password to create")
            .located(By.xpath("//*[@id=\"password\"]"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("write password to confirm")
            .located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target SELECT_TERMSOFUSE = Target.the("accept terms of use")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target SELECT_CODEOFCONDUCT = Target.the("accept code of conduct")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target SELECT_PRIVACYSECURITY = Target.the("accept privacy & security policy")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target ENTER_BUTTONCOMPLETESETUP = Target.the("Select button complete setup")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));

    public static final Target END_USER = Target.the("Title")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}