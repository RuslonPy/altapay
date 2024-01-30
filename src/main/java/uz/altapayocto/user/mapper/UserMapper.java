package uz.altapayocto.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import uz.altapayocto.card.dto.CardDto;
import uz.altapayocto.card.entity.Card;
import uz.altapayocto.cardtransactions.dto.TransactionsDto;
import uz.altapayocto.cardtransactions.entity.CardTransactions;
import uz.altapayocto.user.dto.UserDto;
import uz.altapayocto.user.entity.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDTO(User users);

    CardDto toCardDTO(Card card);

    List<TransactionsDto> toTransactionDtoList(List<CardTransactions> transactions);

}
