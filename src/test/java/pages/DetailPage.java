package pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.Assert.assertTrue;

public class DetailPage {

    public void checkAuthor(String bookAuthor) {
        String author = $$(".ed24e").get(0).text();
        assertTrue(author.equals(bookAuthor));
    }

    public void addToCart() {
        $(byText("Добавить в корзину")).click();
    }

    public void goToCart() {
        $(byText("Корзина")).click();
    }
}
