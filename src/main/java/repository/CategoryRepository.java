package repository;

import db.CategoryDB;
import model.Category;

import java.util.List;

public class CategoryRepository {
    CategoryDB categoryDb = new CategoryDB();

    public List<Category> getCategoryList() {
        return categoryDb.getCategoriesFromCsv();
    }
}
