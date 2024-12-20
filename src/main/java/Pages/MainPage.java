package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends BaseTest {

    public MainPage AcceptCookies() {
        driver.findElement(By.id("a-autoid-0")).click();
        return this;
    }

    @Step("Anasayfa-Giriş butonu basılır")
    public MainPage SignButton() {
        driver.findElement(By.id("nav-link-accountList")).click();
        screenshot();
        return this;
    }
    @Step("Çok satanlar kategorisine basılır")
    public MainPage BestSellers() {
        driver.findElement(By.xpath("//div[@id='nav-xshop']/a[.='Çok Satanlar']")).click();
        screenshot();
        return this;
    }



}
