package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CategoryPage {

    public void selectProduct(String bookName) {
        $(By.linkText(bookName)).click();
    }

}
