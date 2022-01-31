package po;

import org.openqa.selenium.By;

public class HeaderSite {
    public static final By LOGO_STELLA_BURGER = By.xpath("//div[@class='AppHeader_header__logo__2D0X2']");
    public static final By BUTTON_CONSTRUCTOR = By.xpath("//*[@class='AppHeader_header__linkText__3q_va ml-2' and contains (text(),'Конструктор')]");
    public static final By BUTTON_PERSONAL_AREA = By.xpath("//*[@class='AppHeader_header__linkText__3q_va ml-2' and contains (text(),'Личный Кабинет')]");
}