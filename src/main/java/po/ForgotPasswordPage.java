package po;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static po.RegisterPage.formEnter;

public class ForgotPasswordPage {
    public static final SelenideElement buttonEnterFromRegistration = $x("//*[@class='Auth_link__1fOlj' and contains (text(),'Войти')]");
    public static final SelenideElement buttonRestorePassword = $x("//*[@class='Auth_link__1fOlj' and contains (text(),'Восстановить пароль')]");
    public static final SelenideElement buttonEnterFromRestorePassword = $x("//*[@class = 'Auth_link__1fOlj' and contains (text(),'Войти')]");

    @Step("Open from registration")
    public void openFromRegistration() {
        $(buttonEnterFromRegistration).click();
        $(formEnter).shouldBe(Condition.visible);
    }

    @Step("Open from restore password")
    public void openFromRestorePassword() {
        $(buttonRestorePassword).click();
        $(buttonEnterFromRegistration).shouldBe(Condition.visible);
        $(buttonEnterFromRestorePassword).click();
    }
}
