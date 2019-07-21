package steps;

import cucumber.api.java.ru.Допустим;
import pages.RaiffeisenHomePage;

import static com.codeborne.selenide.Selenide.open;

public class RaiffeisenHome {
    RaiffeisenHomePage raiffeisenHomePage = new RaiffeisenHomePage();

    @Допустим("^Главная -- Открываем сайт на странице \"([^\"]*)\"$")
    public void главная_Открываем_сайт_на_странице(String arg1) {
        open(arg1);
    }

    @Допустим("^Главная -- Вводим срок кредитования \"([^\"]*)\" месяцев$")
    public void главная_Вводим_срок_кредитования_месяцев(String arg1) {
        raiffeisenHomePage.creditAmount().getText();

    }

    @Допустим("^Главная -- Вводим сумму кредита \"([^\"]*)\" рублей$")
    public void главная_Вводим_сумму_кредита_рублей(String arg1) {


    }

    @Допустим("^Главная -- Сравниваем что введенная сумма \"([^\"]*)\" и срок \"([^\"]*)\" отображаются корректно$")
    public void главная_Сравниваем_что_введенная_сумма_и_срок_отображаются_корректно(String arg1, String arg2) {

    }

    @Допустим("^Главная -- Нажимаем кнопку оформить$")
    public void главная_Нажимаем_кнопку_оформить() {

    }

}
