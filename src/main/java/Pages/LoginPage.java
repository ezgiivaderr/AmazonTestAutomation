package Pages;

import Base.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class LoginPage extends BaseTest {




    @Step("E-posta alanı doldurulur")
    public LoginPage fillMail(String text) {
        driver.findElement(By.id("ap_email")).clear();
        driver.findElement(By.id("ap_email")).sendKeys(text);
        screenshot();
        return this;
    }
    @Step("Devam et butonu basılır")
    public LoginPage DevametClick() {
        driver.findElement(By.id("continue")).click();
        return this;
    }

    @Step("Şifre alanı doldurulur")
    public LoginPage fillPassword(String text) {
        driver.findElement(By.id("ap_password")).clear();
        driver.findElement(By.id("ap_password")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step("Giriş butonuna basılır")
    public LoginPage clickLogin() {
        driver.findElement(By.id("signInSubmit")).click();
        return this;
    }
    @Step("Kullanıcı bilgisi getirilir")
    public String getUserInfo() {
        String text = driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).getText();
        Allure.addAttachment(text + " metni ekanda görüntülenmiştir", "");
        screenshot();
        return text;
    }
    @Step("Hata mesajı alınır")
    public String getErrorMessage() {
        String warningMessage = driver.findElement(By.xpath("//h4[.='Bir sorun oluştu']")).getText();
        Allure.addAttachment(warningMessage + " hata mesajı ekrandan çekilir", "");
        screenshot();
        return warningMessage;
    }
    @Step("Hata mesajı alınır")
    public String getErrorEmail() {
        String warningMessage = driver.findElement(By.xpath("//div[@id='auth-email-missing-alert']//div[@class='a-alert-content']")).getText();
        Allure.addAttachment(warningMessage + " hata mesajı ekrandan çekilir", "");
        screenshot();
        return warningMessage;
    }
    @Step("Hata mesajı alınır")
    public String getErrorPassword() {
        String warningMessage = driver.findElement(By.cssSelector("body > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(7) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2)")).getText();
        Allure.addAttachment(warningMessage + " hata mesajı ekrandan çekilir", "");
        screenshot();
        return warningMessage;
    }

}
