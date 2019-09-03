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

    @Допустим("^Каталог -- Добавляем фильтр \"([^\"]*)\"$")
    public void каталог_Добавляем_фильтр(String arg1) {
        category.addFilter(arg1);
    }

    @Допустим("^Каталог -- Устанавливаем диапазон цен от \"([^\"]*)\" до \"([^\"]*)\"$")
    public void каталог_Устанавливаем_диапазон_цен_от_до(String arg1, String arg2) {
        category.selectPriceRange(arg1, arg2);
    }

}
