import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test(description = "Başarılı kullanıcı giriş kontrolü")
    public void SuccessfullLogin() throws InterruptedException {
        mainPage.SignButton();
        sleep(3000);
        loginPage.fillMail(mail)
                .DevametClick()
                .fillPassword(password)
                .clickLogin();
        sleep(3000);

        assertEqualsText("Hesap ve Listeler", loginPage.getUserInfo());
    }

    @Test(description = "Başarısız kullanıcı giriş kontrolü")
    public void UnSuccessfullLogin() throws InterruptedException {
        mainPage.SignButton();
        sleep(3000);
        loginPage.fillMail("som@outlook.cm.tr")
                .DevametClick();

        sleep(3000);
        assertEqualsText(loginPage.getErrorMessage(), "Bir sorun oluştu");

        loginPage.fillMail("someone000001@outlook.com.tr")
                .DevametClick()
                .fillPassword("1234")
                .clickLogin();

        sleep(3000);
        assertEqualsText(loginPage.getErrorMessage(), "Bir sorun oluştu");
    }

   @Test(description = "Boş E-posta Alanı Giriş")
    public void EmptyEmail() throws InterruptedException {
       mainPage.SignButton();
       sleep(3000);
        loginPage.fillMail("")
                .DevametClick();

        sleep(3000);
        assertEqualsText(loginPage.getErrorEmail(), "E-posta adresinizi veya cep telefonu numaranızı girin");
    }

    @Test(description = "Boş şifre alanı giriş")
    public void EmptyPassword() throws InterruptedException {
        mainPage.SignButton();
        sleep(3000);
        loginPage.fillMail("someone000001@outlook.com.tr")
                .DevametClick()
                .fillPassword("")
                .clickLogin();

        sleep(3000);
        assertEqualsText(loginPage.getErrorPassword(), "Şifrenizi girin");

    }
}