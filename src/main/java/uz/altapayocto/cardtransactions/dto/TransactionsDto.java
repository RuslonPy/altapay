package uz.altapayocto.cardtransactions.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.altapayocto.cardtransactions.transactiontype.TypeTransactions;

@Getter
@Setter
public class TransactionsDto {
    private Long id;
    private String amount;
    private String dt;
    private String newBalance;
    private String oldBalance;
    private TypeTransactions typeTransactions;}
