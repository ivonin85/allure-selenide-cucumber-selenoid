package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    public void closeCookies() {
        $("button.close").click();
    }

    public void openSite(String siteUrl) {
        open(siteUrl);
    }

    public void searchQuery(String searchQuery) {
        $("input.search-input").sendKeys(searchQuery);
        $("button.m-search.button.default.flat-button").click();
    }

    public void clickCatalog(){
        $("._85855").click();
    }

    public void selectCategoryInCatalog(){

        $("[href=\"/category/knigi-16500/\"]").click();
    }
}
