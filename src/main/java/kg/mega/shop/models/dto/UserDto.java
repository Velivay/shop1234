package kg.mega.shop.models.dto;

import kg.mega.shop.models.entyty.Account;
import kg.mega.shop.models.enums.Role;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class UserDto {
    private Long id;
    private String name;
    private Account account;
    private String address;
    private int number;
    private Role role;
}
