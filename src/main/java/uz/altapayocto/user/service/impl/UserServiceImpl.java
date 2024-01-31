package uz.altapayocto.user.service.impl;

import org.springframework.stereotype.Service;
import uz.altapayocto.card.dto.CardDto;
import uz.altapayocto.card.entity.Card;
import uz.altapayocto.cardtransactions.entity.CardTransactions;
import uz.altapayocto.user.dto.UserDto;
import uz.altapayocto.user.entity.User;
import uz.altapayocto.user.mapper.UserMapper;
import uz.altapayocto.user.repository.UserRepository;
import uz.altapayocto.user.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper mapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override
    public List<UserDto> getUsersInfo() {
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> {
            UserDto userDto = mapper.toUserDTO(user);
            List<Card> cards = user.getCards();
            List<CardDto> cardDtos = cards.stream()
                    .map(card -> {
                        CardDto cardDto = mapper.toCardDTO(card);
                        List<CardTransactions> transactions = card.getCardTransactions();
                        cardDto.setTransactions(mapper.toTransactionDtoList(transactions));
                        return cardDto;
                    }).toList();
            userDto.setCards(cardDtos);
            return userDto;
        }).toList();
    }
}
