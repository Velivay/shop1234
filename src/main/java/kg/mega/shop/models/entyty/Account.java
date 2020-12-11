package kg.mega.shop.models.entyty;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    private String Login;
    private String password;
}
