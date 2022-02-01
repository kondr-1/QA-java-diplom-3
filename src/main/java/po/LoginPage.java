package po;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static po.HomePage.*;
import static po.RegisterPage.*;

public class LoginPage {
    public static final SelenideElement formEnter = $x("//*[@class='Auth_login__3hAey']/child::h2[contains (text(),'Вход')]");
    public static final SelenideElement buttonEnter = $x("//button[@class = 'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa' and contains (text(),'Войти')]");
    public static final SelenideElement fieldEmailLoginPage = $x("//*[@class = 'input__placeholder text noselect text_type_main-default' and contains (text(),'Email')]/following-sibling::input");
    public static final SelenideElement fieldPasswordLoginPage = $x("//*[@class = 'input__placeholder text noselect text_type_main-default' and contains (text(),'Пароль')]/following-sibling::input");

    @Step("Open form enter account")
    public boolean openEnterAccount() {
        try {
            $(buttonEnterAccount).click();
            $(fieldEmail).shouldBe(Condition.visible);
            return true;
        } catch (ElementNotFound e) {
            return false;
        }
    }

    @Step("Login user")
    public boolean loginUser(String email, String password) {
        try {
            $(formEnter).shouldBe(Condition.visible);
            $(fieldEmailLoginPage).setValue(email);
            $(fieldPasswordLoginPage).setValue(password);
            $(buttonEnter).click();
            $(createBurger).shouldBe(Condition.visible);
            return true;
        } catch (ElementNotFound e) {
            return false;
        }
    }

    @Step("Open login user from personal area")
    public boolean openLoginPagePersonArea() {
        try {
            $(buttonPersonalArea).click();
            $(formEnter).shouldBe(Condition.visible);
            return true;
        } catch (ElementNotFound e) {
            return false;
        }
    }

    @Step("Open login user from registration")
    public boolean openLoginPageRegistration() {
        try {
            openEnterAccount();
            $(registrationButton).click();
            $(registrationButtonOk).shouldBe(Condition.visible);
            new ForgotPasswordPage().openFromRegistration();
            return true;
        } catch (ElementNotFound e) {
            return false;
        }
    }

    @Step("Open login user from restore password")
    public boolean openLoginPageFromRestorePassword() {
        try {
            openEnterAccount();
            new ForgotPasswordPage().openFromRestorePassword();
            $(formEnter).shouldBe(Condition.visible);
            return true;
        } catch (ElementNotFound e) {
            return false;
        }
    }
}