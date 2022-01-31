package ui;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Actions {
    @Step("Open page and visible element")
    public static boolean openURL(String url, By visible) {
        try {
            open(url);
            $(visible).shouldBe(Condition.visible);
            return true;
        } catch (
                org.openqa.selenium.InvalidSelectorException e) {
            return false;
        }
    }

    @Step("Click")
    public static boolean click(By list) {
        try {
            $(list).click();
            return true;
        } catch (
                org.openqa.selenium.InvalidSelectorException e) {
            return false;
        }
    }

    @Step("Click and set value")
    public static boolean clickAndSetValue(By list, String value) {
        try {
            $(list).setValue(value);
            return true;
        } catch (
                org.openqa.selenium.InvalidSelectorException e) {
            return false;
        }
    }

    @Step("Click and visible element")
    public static boolean clickAndShouldBe(By list, By visebel) {
        try {
            $(list).click();
            $(visebel).shouldBe(Condition.visible);
            return true;
        } catch (org.openqa.selenium.InvalidSelectorException e) {
            return false;
        }
    }

    @Step("Get axis position Y")
    public static int getLocationElementY(By list) {
        return $(list).findElement(list).getLocation().getY();
    }
}