package service;

import model.Category;
import repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CategoryService {

    private final CategoryRepository categoryRepository = new CategoryRepository();

    public List<Category> getSortedCategory(List<Category> unsortedCategory, int level) {
        if (Objects.isNull(unsortedCategory) || level <= 0) {
            return null;
        }

        List<Category> sortedList = new ArrayList<>();
        int i = 0;
        for (i = 1; i <= level; i++) {
            int finalI = i;
            List<Category> lvl1 = unsortedCategory.stream().filter(uc -> uc.getLevel() == finalI).collect(Collectors.toList());
            System.out.println(lvl1);


        }
        return sortedList;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.getCategoryList();
    }
}
