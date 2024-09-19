package fr.solid.solid.D.service.impl;

import fr.solid.solid.D.service.IUserService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("B")
public class UserServiceImpl2 implements IUserService {
    @Override
    public String CreatUser(String user) {
        return "profile B";
    }
}




