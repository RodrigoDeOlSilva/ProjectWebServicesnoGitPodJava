package com.rodi.course.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rodi.course.entities.User;
import com.rodi.course.repositories.UserRepositiry;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepositiry userRepositiry;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Funcionando");
        List<User> listUser = new ArrayList<>();
        listUser.add(new User(null,"Rodrigo Silva","rodrigo@gmail.com","999784545","123456"));
        listUser.add(new User(null,"Fernando Silva","fernando@gmail.com","998897454","656565"));
        listUser.add(new User(null,"Bruna Silva","bruna@gmail.com","9994545","125659593456"));
        listUser.add(new User(null,"Patricia Silva","patricia@gmail.com","9945454","87874"));

        userRepositiry.saveAll(listUser);



    }


}
