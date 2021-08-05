package vrn.tarasovy.intensive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vrn.tarasovy.intensive.dto.UserDto;
import vrn.tarasovy.intensive.service.UserService;


@Controller
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/test")
    public void add(@RequestBody UserDto userDto){
        userService.addUser(userDto);
    }
}
