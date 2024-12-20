package Pages;

import Base.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class ProductPage extends BaseTest {


    @Step("altkategori seçilir")
    public ProductPage subcategoryClick() {
        driver.findElement(By.xpath("//a[contains(text(),'Gıda Ürünleri')]")).click();
        screenshot();
        return this;
    }

    @Step("Bir ürün seçilir")
    public ProductPage productClick() {
        driver.findElement(By.cssSelector("body div[id='a-page'] div[id='p13n-asin-index-0'] span span div:nth-child(1)")).click();
        return this;
    }

    @Step("Seçilen 1 ürün sepete eklenir")
    public ProductPage addcart() {
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        screenshot();
        return this;
    }

}
