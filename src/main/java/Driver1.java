import model.Category;
import service.CategoryService;

import java.util.List;

public class Driver1 {
    public static void main(String[] args) {
        CategoryService categoryService = new CategoryService();
        List<Category> categoryList = categoryService.getAllCategories();

        System.out.println(categoryList);
    }
}
