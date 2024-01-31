package uz.altapayocto.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import uz.altapayocto.card.dto.CardDto;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class UserDto {
    private Long id;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dob;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp dt;
    @Email
    private String email;
    private String fio;
    private String phone;
    private int status;
    private List<CardDto> cards;
}
