package steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.ru.Допустим;
import pages.HomePage;

public class HomeSteps {
    HomePage home = new HomePage();
    String siteUrl = "https://www.ozon.ru/";

    @After
    public void after(){
        Selenide.close();
    }

    @Допустим("^Главная -- Закрываем уведомление cooke$")
    public void главная_Закрываем_уведомление_cooke() {
        home.closeCookies();
    }

    @Допустим("^Открываем сайт$")
    public void открываем_сайт() {
        home.openSite(siteUrl);
    }

    @Допустим("^Главная -- Осуществляем поиск по запросу \"([^\"]*)\"$")
    public void главная_Осуществляем_поиск_по_запросу(String arg1) {
        home.searchQuery(arg1);
    }

    @Допустим("^Главная -- Нажимаем кнопку Каталог$")
    public void главная_Нажимаем_кнопку_Каталог() {
        home.clickCatalog();
    }

    @Допустим("^Главная -- Выбираем раздел$")
    public void главная_Выбираем_раздел() {
        home.selectCategoryInCatalog();
    }
}
