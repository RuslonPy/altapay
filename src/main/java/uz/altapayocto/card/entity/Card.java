package uz.altapayocto.card.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.altapayocto.card.cardtype.CardType;
import uz.altapayocto.cardtransactions.entity.CardTransactions;
import uz.altapayocto.user.entity.User;

import java.sql.Timestamp;
import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "card_name")
    private String cardName;

    @Column(name = "card_type")
    @Enumerated(value = EnumType.STRING)
    private CardType cardType;

    @Column(name = "card_number", length = 16)
    private String cardNumber;

    @Column(name = "card_expire", length = 5)
    private String cardExpire;

    @Column(name = "balance")
    private Long balance;

    @Column(name = "status")
    private Integer status;

    @Column(name = "dt", columnDefinition = "TIMESTAMP DEFAULT current_timestamp")
    private Timestamp dt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CardTransactions> cardTransactions;
}
