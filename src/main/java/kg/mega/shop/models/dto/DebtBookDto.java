package kg.mega.shop.models.dto;

import kg.mega.shop.models.entyty.User;
import lombok.Data;


@Data
public class DebtBookDto {
    private Long id;
    private  boolean sum;
    private User costumer;
}
