package kg.mega.shop.models.dto;

import kg.mega.shop.models.entyty.OperationDetail;
import kg.mega.shop.models.entyty.User;
import lombok.Data;

@Data
public class OperationDto {
    private Long id;
    private User user;
    private User costumer;
    private boolean totalCost;
    private boolean actualAmount;
    private int difference;

    private OperationDetail operationDetail;
}
