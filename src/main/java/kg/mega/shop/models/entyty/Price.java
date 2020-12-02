package kg.mega.shop.models.entyty;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Price {
    @Id
    @GeneratedValue
    private Long id;
    private Price price;
    private Date startDate;
    private Date endDate;


}
