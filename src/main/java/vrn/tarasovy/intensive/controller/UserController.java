package vrn.tarasovy.intensive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vrn.tarasovy.intensive.dto.UserDto;
import vrn.tarasovy.intensive.enums.Role;
import vrn.tarasovy.intensive.service.UserService;

import java.util.UUID;


@Controller
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PreAuthorize("hasRole('USER')")
    @PostMapping("/test")
    public UserDto save(){
        UserDto user = new UserDto();
        user.setLogin("test");
        user.setPassword("test");
        user.setRole(Role.USER);
        return userService.findByLogin("test");
    }
    @GetMapping("/{id}")
    public UserDto getById(@PathVariable String  id){
        UserDto user = userService.getById(UUID.fromString(id));
        return user;
    }
}
