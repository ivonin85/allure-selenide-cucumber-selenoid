package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CategoryPage {

    public void selectProduct(String bookName) {
        $(By.linkText(bookName)).click();
    }

    public void selectCategory(String category){
        $(byText(category)).click();
    }

    public void seltSubCategory(String subCategory){
        $(byText(subCategory)).click();

    }

}
