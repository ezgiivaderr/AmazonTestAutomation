package Pages;

import Base.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class ProductPage extends BaseTest {

    @Step("Kafa lambasına tıklanır")
    public ProductPage headlampClick() {
        driver.findElement(By.xpath("//div[@class='celwidget pd_rd_w-uVATM content-id-amzn1.sym.230e5d6a-5c1f-4947-ae67-84f2322f6a41 pf_rd_p-230e5d6a-5c1f-4947-ae67-84f2322f6a41 pf_rd_r-8C3W3SNRYCGWPDJHVRG9 pd_rd_wg-jJJTa pd_rd_r-70fc2feb-8cd4-4a8f-9d59-b5f5c32fc2b6 c-f']//div[@class='p13n-sc-uncoverable-faceout']/div[1]/div[1]//div[contains(.,'SM SunniMix 300 Lümen USB şarj edilebilir LED kafa lambası, ayarlanabilir alın l']")).click();
        screenshot();
        return this;
    }

    @Step("Seçilen 1 ürün sepete eklenir")
    public ProductPage addcart() {
        driver.findElement(By.id("add-to-cart-button"));
        screenshot();
        return this;
    }

}
