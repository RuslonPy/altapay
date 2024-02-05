package uz.altapayocto.cardtransactions.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.altapayocto.cardtransactions.transactiontype.TypeTransactions;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
        "id",
        "amount",
        "dt",
        "new_balance",
        "old_balance",
        "type"
})
public class TransactionsDto {
    private Long id;
    private String amount;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dt;
    @JsonProperty("new_balance")
    private String newBalance;
    @JsonProperty("old_balance")
    private String oldBalance;
    private TypeTransactions type;
}
