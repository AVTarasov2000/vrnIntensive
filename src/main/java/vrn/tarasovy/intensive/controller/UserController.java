package vrn.tarasovy.intensive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vrn.tarasovy.intensive.dto.UserDto;
import vrn.tarasovy.intensive.enums.Role;
import vrn.tarasovy.intensive.service.UserService;


@Controller
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/test")
    public UserDto add(){
        UserDto user = new UserDto();
        user.setLogin("test");
        user.setPassword("test");
        user.setRole(Role.USER);
        return userService.addUser(user);
    }
}
