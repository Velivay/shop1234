package kg.mega.shop.models.entyty;

import kg.mega.shop.models.enums.Role;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Accaunt accaunt;
    private String address;
    private int number;
    private Role role;

}
