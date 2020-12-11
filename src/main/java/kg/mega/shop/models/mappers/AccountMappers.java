package kg.mega.shop.models.mappers;

import kg.mega.shop.models.dto.AccountDto;
import kg.mega.shop.models.dto.UserDto;
import kg.mega.shop.models.entyty.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMappers {
   AccountMappers INSTANSE=Mappers.getMapper(AccountMappers.class);
    @Mapping(source = "userDto.account.login",target = "login")
    @Mapping(source = "userDto.account.password",target = "password")
    AccountDto userDtoToAccountDto(UserDto userDto);

    AccountDto toAccountDto(Account account);
    Account toAccount(AccountDto accountDto);


}
