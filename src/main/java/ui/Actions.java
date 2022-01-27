package ui;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Actions {
    //Открываем страницу если видим что есть куки закрываем их)
    public static void openURL(String url, By visible) {
        open(url);
        $(visible).shouldBe(Condition.visible);

    }

    //"Нажать просто клик")
    public static void click(By list) {
        $(list).click();
    }

    //Ввод значения в поле
    public static void clickAndSetValue(By list, String value) {
        $(list).setValue(value);
    }

    //"Нажать на элемент по ID  и проверка появившегося текста")
    public static void clickAndShouldBe(By list, By wisebel) {
        $(list).click();
        $(wisebel).shouldBe(Condition.visible);
    }

    //Получить расположение элемента по оси Y
    public static int getLocationElementY(By list) {
        return $(list).findElement(list).getLocation().getY();
    }
}