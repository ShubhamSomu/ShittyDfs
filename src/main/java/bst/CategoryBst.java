package bst;

import model.Category;
import org.apache.commons.collections.CollectionUtils;
import service.CategoryService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class CategoryBst {
    private final CategoryService categoryService;

    public CategoryBst(CategoryService categoryService) {
        this.categoryService = Objects.requireNonNull(categoryService, "categoryService");
    }


    public void arrange() {
        List<Category> categories = categoryService.getAllCategories();
        List<Category> lvl1CategoryList = categories.stream().filter(cat -> cat.getLevel() == 1).collect(Collectors.toList());
        List<Node> lvl1Node = new ArrayList<>();
        lvl1CategoryList.forEach(category -> {
            lvl1Node.add(new Node(category));
        });
        categories.removeAll(lvl1CategoryList);

        lvl1Node.stream().forEach(cat2 -> cat2.child = findAllChildren(cat2.parent, categories));
        System.out.println("Lvel2:\n " + lvl1Node);
        lvl1Node.stream().forEach(cat2 -> cat2.child = findAllChildren(cat2.parent, categories));
        System.out.println("Lvel3:\n " + lvl1Node);
    }

    class Node {
        Category parent;
        List<Node> child;

        public Node(Category data) {
            parent = data;
            child = null;
        }
    }

    public List<Node> findAllChildren(Category category, List<Category> data) {
        if (CollectionUtils.isEmpty(data)) {
            return null;
        }
        List<Node> childCategories = data.stream()
                .filter(cat -> cat.getParentCode()
                        .equals(category.getCode()))
                .sorted()
                .map(Node::new)
                .collect(Collectors.toList());

        return childCategories;
    }
}