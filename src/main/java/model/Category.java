package model;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByName;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(onlyExplicitlyIncluded = true)
public class Category implements Serializable, Comparable<Category> {

    @CsvBindByName
    @ToString.Include
    private String code;

    @CsvBindByName
    private int level;

    @CsvBindByName
    private String parentCode;

    @Override
    public int compareTo(Category o) {
        return 0;
    }
}
