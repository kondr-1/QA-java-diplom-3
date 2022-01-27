package po;

import org.openqa.selenium.By;

public class LocatorsLogin {
    public static final By REGISTRATION_BUTTON = By.xpath("//*[@class = 'Auth_link__1fOlj'and contains (text(),'Зарегистрироваться')]");
    public static final By FIELD_NAME = By.xpath("//*[@class = 'input__placeholder text noselect text_type_main-default' and contains (text(),'Имя')]/following-sibling::input");
    public static final By FIELD_EMAIL = By.xpath("//*[@class = 'input__placeholder text noselect text_type_main-default' and contains (text(),'Email')]/following-sibling::input");
    public static final By FIELD_PASSWORD = By.xpath("//*[@class = 'input__placeholder text noselect text_type_main-default' and contains (text(),'Пароль')]/following-sibling::input");
    public static final By REGISTRATION_BUTTON_OK = By.xpath("//button[@class = 'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa' and contains (text(),'Зарегистрироваться')]");
    public static final By REGISTRATION_ERROR_PASSWORD = By.xpath("//*[@class='input__error text_type_main-default' and contains (text(),'Некорректный пароль')]");
    public static final By FORM_AUTHORIZATION = By.xpath("//*[@class='Auth_login__3hAey']/child::h2[contains (text(),'Регистрация')]");
    public static final By FORM_ENTER = By.xpath("//*[@class='Auth_login__3hAey']/child::h2[contains (text(),'Вход')]");
    public static final By BUTTON_ENTER_ACCOUNT = By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg'and contains (text(),'Войти в аккаунт')]");
    public static final By BUTTON_ENTER = By.xpath("//button[@class = 'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa' and contains (text(),'Войти')]");
    public static final By BUTTON_ENTER_FROM_REGISTRATION = By.xpath("//*[@class='Auth_link__1fOlj' and contains (text(),'Войти')]");
    public static final By BUTTON_PERSONAL_AREA = By.xpath("//*[@class='AppHeader_header__linkText__3q_va ml-2' and contains (text(),'Личный Кабинет')]");
    public static final By CREATE_BURGER = By.xpath("//*[@class='text text_type_main-large mb-5 mt-10' and contains (text(),'Соберите бургер')]");
    public static final By BUTTON_RESTORE_PASSWORD = By.xpath("//*[@class='Auth_link__1fOlj' and contains (text(),'Восстановить пароль')]");
    public static final By BUTTON_ENTER_FROM_RESTORE_PASSWORD = By.xpath("//*[@class = 'Auth_link__1fOlj' and contains (text(),'Войти')]");
    public static final By BUTTON_EXIT_FROM_PERSONAL_AREA = By.xpath("//button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive' and contains (text(),'Выход')]");
    public static final By LOGO_STELLA_BURGER = By.xpath("//div[@class='AppHeader_header__logo__2D0X2']");
    public static final By BUTTON_CONSTRUCTOR = By.xpath("//*[@class='AppHeader_header__linkText__3q_va ml-2' and contains (text(),'Конструктор')]");
    public static final By TEXT_CREATE_BURGER = By.xpath("//*[@class='text text_type_main-large mb-5 mt-10' and contains (text(),'Соберите бургер')]");
    public static final By CHAPTER_BUN = By.xpath("//*[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']/child::span[contains (text(),'Булки')]");
    public static final By CHAPTER_SAUCE = By.xpath("//*[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']/child::span[contains (text(),'Соусы')]");
    public static final By CHAPTER_TOPPINGS = By.xpath("//*[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']/child::span[contains (text(),'Начинки')]");
    public static final By ALLOCATED_BUN = By.xpath("//*[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/child::span[contains (text(),'Булки')]");
    public static final By ALLOCATED_SAUCE = By.xpath("//*[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/child::span[contains (text(),'Соусы')]");
    public static final By ALLOCATED_TOPPINGS = By.xpath("//*[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/child::span[contains (text(),'Начинки')]");
    public static final By TEXT_TOPPINGS = By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10' and contains (text(), 'Начинки')]");
    public static final By TEXT_SAUCE = By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10' and contains (text(), 'Соусы')]");
    public static final By TEXT_BUN = By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10' and contains (text(), 'Булки')]");
}