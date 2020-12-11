package kg.mega.shop.models.dto;

import kg.mega.shop.models.entyty.CategoryProduct;
import kg.mega.shop.models.entyty.User;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;
@Data
@Entity
public class ProductDto {
    private Long id;
    private String name;
    private Date date;
    private boolean shelfLife;
    private int minQuantity;
    private int maxQuantity;
    private CategoryProduct category;
    private User provider;
}
