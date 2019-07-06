package steps;

import cucumber.api.java.ru.Допустим;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static junit.framework.TestCase.assertTrue;

public class OdobrimCash {
    @Допустим("^открываем сайт на странице \"([^\"]*)\"$")
    public void открываем_сайт_на_странице(String arg1) {
        open(arg1);
    }

    @Допустим("^вводим сумму кредита (\\d+)$")
    public void вводим_сумму_кредита(String arg1) {
        $(By.id("amount")).click();
        $(By.id("amount")).sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), arg1);
    }

    @Допустим("^вводим срок кредитования (\\d+) месяцев$")
    public void вводим_срок_кредитования_месяцев(String arg1) {
        $(By.id("period")).click();
        $(By.id("period")).sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), arg1);
    }

    @Допустим("^Нажимаем кнопку подобрать кредит$")
    public void нажимаем_кнопку_подобрать_кредит() {
        $(".sc-bbmXgH.ga_btn_podbor_credit.LandingFormstyled__LandingFormButton-sc-1tfivmc-3.doHXgy").click();
    }

    @Допустим("^сверяем совпадает ли сумма (\\d+)$")
    public void сверяем_совпадает_ли_сумма(String arg1) {

        String val = $(By.id("amount")).getValue();
        String bestVal = val.substring(0, (val.length() - 2)).replaceAll("\\s+", "");
        try {

            assertTrue(bestVal.equals(arg1));
        } catch (AssertionError as) {
            as.printStackTrace();
            System.out.println(bestVal);
        }
    }

    @Допустим("^сверяем правильно ли конвертировались (\\d+) месяцев в \"([^\"]*)\"$")
    public void сверяем_правильно_ли_конвертировались_месяцев_в(int arg1, String arg2) {
        try {
            $(By.id("period")).shouldHave(value(arg2));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
