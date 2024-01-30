package uz.altapayocto.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.altapayocto.card.entity.Card;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fio", nullable = false, length = 255)
    private String fio;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "phone")
    private Long phone;

    @Column(name = "status")
    private Integer status;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "dt", columnDefinition = "TIMESTAMP DEFAULT current_timestamp")
    private Timestamp dt;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Card> cards;

}
