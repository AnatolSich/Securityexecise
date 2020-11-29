package com.springAdvanced.Securityexecise.repository;

import com.springAdvanced.Securityexecise.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
