package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CategoryPage {

    public void selectProduct(String bookName) {
        $(byText(bookName)).click();
    }

    public void selectCategory(String category){
        $(byText(category)).click();
    }

    public void seltSubCategory(String subCategory){
        $(byText(subCategory)).click();

    }

    public void addFilter(String filter){
        sleep(1500);
        $(byText(filter)).click();

    }

    public void selectPriceRange(String firstPrice, String secondPrice){
        $$(".input").get(0).sendKeys(Keys.chord(Keys.CONTROL + "a"));
        $$(".input").get(0).setValue(firstPrice);
        $$(".input").get(1).sendKeys(Keys.chord(Keys.CONTROL + "a"));
        $$(".input").get(1).setValue(secondPrice);
    }

}
