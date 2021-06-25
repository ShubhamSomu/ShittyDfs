package model;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Category {

    @CsvBindByName
    private String code;

    @CsvBindByName
    private int level;

    @CsvBindByName
    private String parentCode;
}
