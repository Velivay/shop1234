package kg.mega.shop.models.entyty;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Operation {
    @Id
    @GeneratedValue
    private Long id;
    private User user;
    private User costumer;
    private boolean totalCost;
    private boolean actualAmount;
    private int difference;

    private OperationDetail operationDetail;

}
