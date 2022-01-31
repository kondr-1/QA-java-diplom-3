package po;

import org.openqa.selenium.By;

public class RegisterPage {
    public static final By REGISTRATION_BUTTON = By.xpath("//*[@class = 'Auth_link__1fOlj'and contains (text(),'Зарегистрироваться')]");
    public static final By FIELD_NAME = By.xpath("//*[@class = 'input__placeholder text noselect text_type_main-default' and contains (text(),'Имя')]/following-sibling::input");
    public static final By FIELD_EMAIL = By.xpath("//*[@class = 'input__placeholder text noselect text_type_main-default' and contains (text(),'Email')]/following-sibling::input");
    public static final By FIELD_PASSWORD = By.xpath("//*[@class = 'input__placeholder text noselect text_type_main-default' and contains (text(),'Пароль')]/following-sibling::input");
    public static final By REGISTRATION_BUTTON_OK = By.xpath("//button[@class = 'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa' and contains (text(),'Зарегистрироваться')]");
    public static final By REGISTRATION_ERROR_PASSWORD = By.xpath("//*[@class='input__error text_type_main-default' and contains (text(),'Некорректный пароль')]");
}