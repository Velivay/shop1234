package kg.mega.shop.models.mappers;

import kg.mega.shop.models.dto.ProductDto;
import kg.mega.shop.models.entyty.Product;
import kg.mega.shop.models.entyty.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMappers {
    ProductMappers INSTANCE= Mappers.getMapper(ProductMappers.class);
    Product toProduct(ProductDto productDto);

    ProductDto toProductDto(Product product);
}
