package uz.altapayocto.card.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.altapayocto.card.cardtype.CardType;
import uz.altapayocto.cardtransactions.dto.TransactionsDto;

import java.util.List;

@Getter
@Setter
public class CardDto {
    private Long id;
    private String balance;
    private String cardExpire;
    private String cardName;
    private CardType cardType;
    private String cardNumber;
    private String dt;
    private int status;
    private List<TransactionsDto> transactions;
}
