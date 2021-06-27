package repository;

import java.util.List;

import db.CategoryDB;
import model.Category;

public class CategoryRepository {
    CategoryDB categoryDb = new CategoryDB();

    public List<Category> getCategoryList() {
        return categoryDb.getCategoriesFromCsv();
    }
}
