package data;

import db.CategoryDB;
import model.Category;

import java.util.List;

public class CategoryMocker {

    CategoryDB categoryDb = new CategoryDB() ;

    public List<Category> getCategoryList() {
        return categoryDb.getCategoriesFromCsv();
    }
}
