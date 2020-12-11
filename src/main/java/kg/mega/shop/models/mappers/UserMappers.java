package kg.mega.shop.models.mappers;

import kg.mega.shop.models.dto.UserDto;
import kg.mega.shop.models.entyty.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMappers {
    UserMappers INSTANCE = Mappers.getMapper(UserMappers.class);

    User toUser(UserDto userDto);

    UserDto toUserDto(User user);
}
