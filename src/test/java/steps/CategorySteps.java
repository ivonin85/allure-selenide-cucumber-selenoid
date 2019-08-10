package steps;

import cucumber.api.java.ru.Допустим;
import pages.CategoryPage;

public class CategorySteps {
    CategoryPage category = new CategoryPage();

    @Допустим("^Каталог -- Выбираем товар \"([^\"]*)\"$")
    public void каталог_Выбираем_товар(String arg1) {
        category.selectProduct(arg1);
    }

}
