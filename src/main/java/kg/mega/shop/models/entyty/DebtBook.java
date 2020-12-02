package kg.mega.shop.models.entyty;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class DebtBook {
    @Id
    @GeneratedValue
    private Long id;
    private  boolean sum;
    @ManyToOne
    private User costumer;

}
