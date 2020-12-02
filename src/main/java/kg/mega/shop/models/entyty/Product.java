package kg.mega.shop.models.entyty;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Date date;
    private boolean shelfLife;
    private int minQuantity;
    private int maxQuantity;
    private CategoryProduct category;
    private User provider;
}
