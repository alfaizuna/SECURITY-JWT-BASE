package com.alfaizuna.securityjwt.dao.repository.user;

import com.alfaizuna.securityjwt.dao.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
