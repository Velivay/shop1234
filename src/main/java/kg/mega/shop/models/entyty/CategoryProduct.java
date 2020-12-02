package kg.mega.shop.models.entyty;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CategoryProduct {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToOne
    private CategoryProduct parentCatigory;
}
