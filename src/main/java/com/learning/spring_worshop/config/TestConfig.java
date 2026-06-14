package com.learning.spring_worshop.config;

import com.learning.spring_worshop.entities.User;
import com.learning.spring_worshop.repositories.UserRepositorie;
import org.springframework.beans.factory.annotation.Autowired;

//Configuration != Configurable
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

//Lembrar de implementar a interfacer CommandLineRunner para fazer as seeds
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepositorie userRepositorie;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepositorie.saveAll(Arrays.asList(u1, u2));
    }
}
