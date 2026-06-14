package com.learning.spring_worshop.repositories;

import com.learning.spring_worshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorie extends JpaRepository<User, Long> {

}
