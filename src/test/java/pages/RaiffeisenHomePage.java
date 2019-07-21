package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RaiffeisenHomePage {

    public SelenideElement creditAmount(){
        return $("[data-field=amount.input]");
    }
}
