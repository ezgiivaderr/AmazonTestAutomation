package Pages;


import Base.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class CartPage extends BaseTest {

    @Step("Sepet ikonuna tıklanır")
    public CartPage carticonClick() {
        driver.findElement(By.xpath("//div[@id='nav-cart-text-container']/span[@class='nav-line-2']")).click();
        return this;
    }
    @Step("sepetteki ürün kontrol")
    public String getcartinfo() {
        String text = driver.findElement(By.id("sc-subtotal-label-buybox")).getText();
        Allure.addAttachment(text + " metni ekanda görüntülenmiştir", "");
        screenshot();
        return text;
    }
    @Step("Sepeti boşaltma")
    public CartPage emptycart() {
        driver.findElement(By.cssSelector(".a-icon-small-remove")).click();
        screenshot();
        return this;
    }
    @Step("sepetiniz boştur")
    public String getdeleteinfo() {
        String text = driver.findElement(By.cssSelector(".a-size-extra-large.a-spacing-mini.a-spacing-top-base.a-text-normal")).getText();
        Allure.addAttachment(text + " metni ekanda görüntülenmiştir", "");
        screenshot();
        return text;
    }

}
