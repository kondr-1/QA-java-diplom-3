package po;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegisterPage {
    public static final SelenideElement formEnter = $x("//*[@class='Auth_login__3hAey']/child::h2[contains (text(),'Вход')]");
    public static final SelenideElement registrationButton = $x("//*[@class = 'Auth_link__1fOlj'and contains (text(),'Зарегистрироваться')]");
    public static final SelenideElement fieldName = $x("//*[@class = 'input__placeholder text noselect text_type_main-default' and contains (text(),'Имя')]/following-sibling::input");
    public static final SelenideElement fieldEmail = $x("//*[@class = 'input__placeholder text noselect text_type_main-default' and contains (text(),'Email')]/following-sibling::input");
    public static final SelenideElement fieldPassword = $x("//*[@class = 'input__placeholder text noselect text_type_main-default' and contains (text(),'Пароль')]/following-sibling::input");
    public static final SelenideElement registrationButtonOk = $x("//button[@class = 'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa' and contains (text(),'Зарегистрироваться')]");
    public static final SelenideElement registrationErrorPassword = $x("//*[@class='input__error text_type_main-default' and contains (text(),'Некорректный пароль')]");

    public void openFormRegistration() {
        $(registrationButton).click();
    }

    public void setNameForm(String name) {
        $(fieldName).setValue(name);
    }

    public void setEmailForm(String email) {
        $(fieldEmail).setValue(email);
    }

    public void setPasswordForm(String password) {
        $(fieldPassword).setValue(password);
    }

    @Step("Click button registration user")
    public boolean clickButtonRegistration() {
        try {
            $(registrationButtonOk).click();
            return $(formEnter).shouldBe(Condition.visible).is(Condition.visible);
        } catch (ElementNotFound e) {
            return false;
        }
    }

    @Step("Error registration user")
    public boolean errorRegistration() {
        try {
            $(registrationButtonOk).click();
            $(registrationErrorPassword).shouldBe(Condition.visible);
            return true;
        } catch (ElementNotFound e) {
            return false;
        }

    }

    @Step("Registration user")
    public boolean registrationUser(String name, String email, String password) {
        setEmailForm(email);
        setPasswordForm(password);
        setNameForm(name);
       return clickButtonRegistration();
    }
}