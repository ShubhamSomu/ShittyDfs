package data;

import java.util.List;

import db.CategoryDB;
import model.Category;

public class CategoryMocker {

    CategoryDB categoryDb = new CategoryDB();

    public List<Category> getCategoryList() {
        return categoryDb.getCategoriesFromCsv();
    }
}
