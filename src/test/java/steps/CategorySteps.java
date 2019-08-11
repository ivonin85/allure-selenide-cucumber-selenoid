package steps;

import cucumber.api.java.ru.Допустим;
import pages.CategoryPage;

public class CategorySteps {
    CategoryPage category = new CategoryPage();

    @Допустим("^Каталог -- Выбираем товар \"([^\"]*)\"$")
    public void каталог_Выбираем_товар(String arg1) {
        category.selectProduct(arg1);
    }

    @Допустим("^Каталог -- Выбираем подраздел \"([^\"]*)\"$")
    public void каталог_Выбираем_подраздел(String arg1) {
        category.selectCategory(arg1);
    }

    @Допустим("^Каталог -- Выбираем раздел в подразделе \"([^\"]*)\"$")
    public void каталог_Выбираем_раздел_в_подразделе(String arg1) {
        category.seltSubCategory(arg1);
    }

}
