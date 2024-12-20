import Base.BaseTest;
import Pages.CartPage;
import Pages.MainPage;
import Pages.ProductPage;
import org.testng.annotations.Test;


public class CartTests extends BaseTest {

    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    MainPage mainPage = new MainPage();

    @Test(description = "Sepete bir ürün ekleme")
    public void addtocart() throws InterruptedException {
        mainPage.BestSellers();
        sleep(3000);
        mainPage.AcceptCookies();
        productPage.subcategoryClick();
        sleep(3000);
        productPage.productClick();
        sleep(3000);
        productPage.addcart();
        sleep(3000);
        cartPage.carticonClick();
        assertEqualsText(cartPage.getcartinfo(), "Ara toplam (1 ürün):");
    }

    @Test (description = "Sepeti temizleme")
    public void deleteProductFromBasket() throws InterruptedException {
        addtocart();
        sleep(3000);
        cartPage.emptycart();
        sleep(3000);
        assertEqualsText(cartPage.getdeleteinfo(), "Amazon sepetiniz boş.");
    }
}
