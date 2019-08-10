package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

public class CartPage {

    String bookName = "Философия Java";

    public void checkProductName() {
        //String nextBookTitle = $(".cart-item__column.m-main-block a.title > span:nth-child(1)").text();
        String bookTitle = $(By.xpath("//a[@class='title']//span")).text();
        assertTrue(bookName.equals(bookTitle));
    }

    public void proceedToCheckout(){
        $(byText("Перейти к оформлению")).click();
    }
}
