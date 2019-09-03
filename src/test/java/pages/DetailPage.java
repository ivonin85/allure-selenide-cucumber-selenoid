package pages;

import com.codeborne.selenide.Condition;
import data.Data;

import static com.codeborne.selenide.Condition.text;
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

    public void compareData(){
        $(".name").shouldBe(text(Data.bookName));
        $("span[data-test-id=\"saleblock-first-price\"]").shouldBe(text(Data.price));
        String author = $$("a[data-test-id=\"writer-link-in-characteristics\"]").get(0).text();
        assertTrue(author.equals(Data.author));
        String series = $$("a[data-test-id=\"seria-link-in-characteristics\"]").get(0).text();
        assertTrue(series.equals(Data.series));
        String publishingHouse = $$("a[data-test-id=\"publisher-link-in-characteristics\"]").get(0).text();
        assertTrue(publishingHouse.equals(Data.publishingHouse));
        String year = $$("span[data-test-id=\"characteristics-item-4-value-span\"]").get(0).text();
        assertTrue(year.equals(Data.year));
        String coverType = $$("span[data-test-id=\"characteristics-item-5-value-span\"]").get(0).text();
        assertTrue(coverType.equals(Data.coverType));
        $(".c49ead").shouldBe(text(Data.description));
        $("span[data-test-id=\"characteristics-item-1-value-span\"]").shouldBe(text(Data.coverAuthor));
        $("span[data-test-id=\"characteristics-item-2-value-span\"]").shouldBe(text(Data.originalName));
        String author1 = $$("a[data-test-id=\"writer-link-in-characteristics\"]").get(1).text();
        assertTrue(author1.equals(Data.author));
        String series1 = $$("a[data-test-id=\"seria-link-in-characteristics\"]").get(1).text();
        assertTrue(series1.equals(Data.series));
        String typeOfPublication = $$("span[data-test-id=\"characteristics-item-5-value-span\"]").get(1).text();
        assertTrue(typeOfPublication.equals(Data.typeOfPublication));
        $("span[data-test-id=\"characteristics-item-6-value-span\"]").shouldBe(text(Data.type));
        $("span[data-test-id=\"characteristics-item-7-value-span\"]").shouldBe(text(Data.publicationFormat));
        $("span[data-test-id=\"characteristics-item-8-value-span\"]").shouldBe(text(Data.ageRestrictions));
        String publishingHouse1 = $$("a[data-test-id=\"publisher-link-in-characteristics\"]").get(1).text();
        assertTrue(publishingHouse1.equals(Data.publishingHouse));
        $("span[data-test-id=\"characteristics-item-10-value-span\"]").shouldBe(text(Data.year));
        $("span[data-test-id=\"characteristics-item-11-value-span\"]").shouldBe(text(Data.numberOfPages));
        $("span[data-test-id=\"characteristics-item-12-value-span\"]").shouldBe(text(Data.comment));
        $("span[data-test-id=\"characteristics-item-13-value-span\"]").shouldBe(text(Data.languageOfPublication));
        $("span[data-test-id=\"characteristics-item-15-value-span\"]").shouldBe(text(Data.isbn));
        $("span[data-test-id=\"characteristics-item-14-value-span\"]").shouldBe(text(Data.coverType));
        $("span[data-test-id=\"characteristics-item-16-value-span\"]").shouldBe(text(Data.shippingWeight));
        String author2 = $$(".main-text").get(0).text();
        assertTrue(author2.equals(Data.author));
        String publishingHouse2 = $$(".main-text").get(1).text();
        assertTrue(publishingHouse2.equals(Data.publishingHouse));



    }
}
