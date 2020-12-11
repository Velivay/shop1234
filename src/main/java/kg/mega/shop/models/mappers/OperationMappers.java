package kg.mega.shop.models.mappers;

import kg.mega.shop.models.dto.OperationDto;
import kg.mega.shop.models.dto.ProductDto;
import kg.mega.shop.models.entyty.Operation;
import kg.mega.shop.models.entyty.Product;
import kg.mega.shop.models.entyty.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OperationMappers {
    OperationMappers INSTANSE=Mappers.getMapper(OperationMappers.class);
    Operation toOperation(OperationDto operationDto);

    OperationDto toOperationDto(Operation operation);
}
