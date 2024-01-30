package uz.altapayocto.user.service;

import uz.altapayocto.user.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getUsersInfo();
}
