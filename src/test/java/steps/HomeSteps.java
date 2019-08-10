package steps;

import cucumber.api.java.ru.Допустим;
import pages.HomePage;

public class HomeSteps {
    HomePage home = new HomePage();
    String siteUrl = "https://www.ozon.ru/";

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
}
