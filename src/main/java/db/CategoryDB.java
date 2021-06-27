package db;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import model.Category;

public class CategoryDB {
    private static final String CATEGORY_CSV = "src/main/resources/csv/category.csv";

    public List<Category> getCategoriesFromCsv() {
        List<Category> categoryList = new ArrayList<>();
        try (Reader reader = Files.newBufferedReader(Paths.get(CATEGORY_CSV))) {
            CsvToBean<Category> csvToBean = new CsvToBeanBuilder<Category>(reader).withType(Category.class).withIgnoreLeadingWhiteSpace(true).build();

            for (Category category : csvToBean) {
                categoryList.add(category);
                System.out.println(category);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return categoryList;
    }
}
