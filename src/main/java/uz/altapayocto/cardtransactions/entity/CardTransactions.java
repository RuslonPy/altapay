package uz.altapayocto.cardtransactions.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.altapayocto.card.entity.Card;
import uz.altapayocto.cardtransactions.transactiontype.TypeTransactions;

import java.util.Date;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cards_transactions")
public class CardTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type", length = 6)
    @Enumerated(value = EnumType.STRING)
    private TypeTransactions type;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "old_balance")
    private Long oldBalance;

    @Column(name = "new_balance")
    private Long newBalance;

    @Column(name = "dt", columnDefinition = "TIMESTAMP DEFAULT current_timestamp")
    private Date dt;

    @ManyToOne
    @JoinColumn(name = "card_id")
    private Card card;

}
