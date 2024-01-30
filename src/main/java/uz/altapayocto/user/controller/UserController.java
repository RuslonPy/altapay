package uz.altapayocto.user.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.altapayocto.user.dto.UserDto;
import uz.altapayocto.user.service.UserService;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Cacheable(value = "users-info", unless = "#result == null")
    @GetMapping("/user-info")
    public ResponseEntity<List<UserDto>> getAllUserInfos() {
        List<UserDto> userDto = userService.getUsersInfo();
        if (userDto.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(userDto);
    }
}
