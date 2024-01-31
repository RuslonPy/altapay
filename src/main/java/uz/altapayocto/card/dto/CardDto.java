package uz.altapayocto.card.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import uz.altapayocto.card.cardtype.CardType;
import uz.altapayocto.cardtransactions.dto.TransactionsDto;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@JsonPropertyOrder({
        "id",
        "balance",
        "card_expire",
        "card_name",
        "card_type",
        "card_number",
        "dt",
        "status",
})
public class CardDto {
    private Long id;
    private String balance;
    @JsonProperty("card_expire")
    private String cardExpire;
    @JsonProperty("card_name")
    private String cardName;
    @JsonProperty("card_type")
    private CardType cardType;
    @JsonProperty("card_number")
    private String cardNumber;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dt;
    private int status;
    private List<TransactionsDto> transactions;
}
