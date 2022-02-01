package po;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static po.LoginPage.formEnter;

public class HomePage {
    public static final SelenideElement buttonExitFromPersonalArea = $x("//button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive' and contains (text(),'Выход')]");
    //header
    public static final SelenideElement logoStellaBurger = $x("//div[@class='AppHeader_header__logo__2D0X2']");
    public static final SelenideElement buttonConstructor = $x("//*[@class='AppHeader_header__linkText__3q_va ml-2' and contains (text(),'Конструктор')]");
    public static final SelenideElement buttonPersonalArea = $x("//*[@class='AppHeader_header__linkText__3q_va ml-2' and contains (text(),'Личный Кабинет')]");
    //form create burger
    public static final SelenideElement buttonEnterAccount = $x("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg'and contains (text(),'Войти в аккаунт')]");
    public static final SelenideElement textCreateBurger = $x("//*[@class='text text_type_main-large mb-5 mt-10' and contains (text(),'Соберите бургер')]");
    public static final SelenideElement chapterBun = $x("//*[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']/child::span[contains (text(),'Булки')]");
    public static final SelenideElement chapterSauce = $x("//*[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']/child::span[contains (text(),'Соусы')]");
    public static final SelenideElement chapterToppings = $x("//*[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']/child::span[contains (text(),'Начинки')]");
    public static final SelenideElement allocatedBun = $x("//*[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/child::span[contains (text(),'Булки')]");
    public static final SelenideElement allocatedSauce = $x("//*[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/child::span[contains (text(),'Соусы')]");
    public static final SelenideElement allocatedToppings = $x("//*[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/child::span[contains (text(),'Начинки')]");
    public static final SelenideElement textToppings = $x("//h2[@class='text text_type_main-medium mb-6 mt-10' and contains (text(), 'Начинки')]");
    public static final SelenideElement textSauce = $x("//h2[@class='text text_type_main-medium mb-6 mt-10' and contains (text(), 'Соусы')]");
    public static final SelenideElement textBun = $x("//h2[@class='text text_type_main-medium mb-6 mt-10' and contains (text(), 'Булки')]");
    public static final SelenideElement createBurger = $x("//*[@class='text text_type_main-large mb-5 mt-10' and contains (text(),'Соберите бургер')]");

    @Step("Check item allotted bun")
    public boolean exitPersonalArea() {
        try {
            $(buttonPersonalArea).click();
            $(buttonExitFromPersonalArea).shouldBe(Condition.visible);
            $(buttonExitFromPersonalArea).click();
            $(formEnter).shouldBe(Condition.visible);
            return true;
        } catch (
                ElementNotFound e) {
            return false;
        }
    }

    @Step("Check item allotted bun")
    public boolean checkItemAllottedBun() {
        int locationsDefaultBun = getLocationElementY(textBun);
        $(chapterBun).click();
        $(allocatedBun).shouldBe(Condition.visible);
        if (locationsDefaultBun != $(textBun).getLocation().getY()) {
            return true;
        } else {
            return false;
        }
    }

    @Step("Check item allotted toppings")
    public boolean checkItemAllottedToppings() {
        int locationsDefaultToppings = getLocationElementY(textToppings);
        $(chapterToppings).click();
        $(allocatedToppings).shouldBe(Condition.visible);
        if (locationsDefaultToppings != $(textToppings).getLocation().getY()) {
            return true;
        } else {
            return false;
        }
    }

    @Step("Check item allotted sauce")
    public boolean checkItemAllottedSauce() {
        int locationsDefaultSauce = getLocationElementY(textSauce);
        $(chapterSauce).click();
        $(allocatedSauce).shouldBe(Condition.visible);
        if (locationsDefaultSauce != $(textSauce).getLocation().getY()) {
            return true;
        } else {
            return false;
        }
    }

    @Step("Get axis position Y")
    public int getLocationElementY(SelenideElement list) {
        return $(list).getLocation().getY();
    }

    @Step("Transition by home logo")
    public boolean transitionByLogo() {
        try {
            $(logoStellaBurger).click();
            $(createBurger).shouldBe(Condition.visible);
            return true;
        } catch (
                ElementNotFound e) {
            return false;
        }
    }

    @Step("Transition by home constructor")
    public boolean transitionByConstructor() {
        try {
            $(buttonConstructor).click();
            $(createBurger).shouldBe(Condition.visible);
            return true;
        } catch (
                ElementNotFound e) {
            return false;
        }
    }

    @Step("Transition by home personal area")
    public boolean transitionByPersonalArea() {
        try {
            $(buttonPersonalArea).click();
            $(buttonExitFromPersonalArea).shouldBe(Condition.visible);
            return true;
        } catch (
                ElementNotFound e) {
            return false;
        }
    }
}