package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * главная страница google
 */
public class GooglePage {
    @Test
    public void userSearch(){
        open("https://www.google.com/");
        $(By.name("q")).setValue("Гороскоп 2024").pressEnter();
    }

}
