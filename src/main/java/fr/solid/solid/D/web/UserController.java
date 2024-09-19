package fr.solid.solid.D.web;


import fr.solid.solid.D.service.IUserService;
import fr.solid.solid.D.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    private IUserService userService;




   @GetMapping("index")
    public String creatUser() {

        return userService.CreatUser(null);
    }
}
