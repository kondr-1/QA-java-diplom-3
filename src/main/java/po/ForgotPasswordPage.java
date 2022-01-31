package po;

import org.openqa.selenium.By;

public class ForgotPasswordPage {
    public static final By BUTTON_ENTER_FROM_REGISTRATION = By.xpath("//*[@class='Auth_link__1fOlj' and contains (text(),'Войти')]");
    public static final By BUTTON_RESTORE_PASSWORD = By.xpath("//*[@class='Auth_link__1fOlj' and contains (text(),'Восстановить пароль')]");
    public static final By BUTTON_ENTER_FROM_RESTORE_PASSWORD = By.xpath("//*[@class = 'Auth_link__1fOlj' and contains (text(),'Войти')]");
}