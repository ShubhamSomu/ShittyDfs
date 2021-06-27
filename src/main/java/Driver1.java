import java.util.List;

import bst.CategoryBst;
import model.Category;
import service.CategoryService;

public class Driver1 {
    public static void main(String[] args) {
        CategoryService categoryService = new CategoryService();
        List<Category> categoryList = categoryService.getAllCategories();

        //System.out.println(categoryList);
        CategoryBst categoryBst = new CategoryBst(categoryService);
        categoryBst.arrange();
    }
}
