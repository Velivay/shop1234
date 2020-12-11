package kg.mega.shop.models.dto;

import kg.mega.shop.models.entyty.CategoryProduct;
import lombok.Data;


@Data
public class CategoryProductDto {
    private Long id;
    private String name;

    private CategoryProduct parentCatigory;
}
