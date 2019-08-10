package steps;

import cucumber.api.java.ru.Допустим;
import pages.CartPage;

public class CartSteps {
    CartPage cart = new CartPage();

    @Допустим("^Корзина -- Проверяем название книги$")
    public void корзина_Проверяем_название_книги() {
        cart.checkProductName();
    }

    @Допустим("^Корзина -- Нажимаем Перейти к оформлению$")
    public void корзина_Нажимаем_Перейти_к_оформлению() {
        cart.proceedToCheckout();
    }
}
