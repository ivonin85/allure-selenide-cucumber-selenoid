package steps;

import cucumber.api.java.ru.Допустим;
import pages.DetailPage;

public class DetailSteps {
    DetailPage detail = new DetailPage();

    @Допустим("^Детали -- Проверяем что автор книги \"([^\"]*)\"$")
    public void детали_Проверяем_что_автор_книги(String arg1) {
        detail.checkAuthor(arg1);
    }

    @Допустим("^Детали -- Добавляем товар в корзину$")
    public void детали_Добавляем_товар_в_корзину() {
        detail.addToCart();
    }

    @Допустим("^Детали -- Переходим в корзину$")
    public void детали_Переходим_в_корзину() {
        detail.goToCart();
    }

}
