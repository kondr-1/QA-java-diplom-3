package po;

import org.openqa.selenium.By;

public class HomePage {
    public static final By BUTTON_ENTER_ACCOUNT = By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg'and contains (text(),'Войти в аккаунт')]");
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
    public static final By CREATE_BURGER = By.xpath("//*[@class='text text_type_main-large mb-5 mt-10' and contains (text(),'Соберите бургер')]");
}