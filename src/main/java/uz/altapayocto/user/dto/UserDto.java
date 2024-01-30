package uz.altapayocto.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.altapayocto.card.dto.CardDto;

import java.util.List;

@Getter
@Setter
public class UserDto {
    private Long id;
    @JsonFormat(pattern="yyyy-MM-dd")
    private String dob;
    @JsonFormat(pattern="yyyy-MM-dd")
    private String dt;
    @Email
    private String email;
    private String fio;
    private String phone;
    private int status;
    private List<CardDto> cards;
}
