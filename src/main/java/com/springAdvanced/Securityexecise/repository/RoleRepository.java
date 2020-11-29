package com.springAdvanced.Securityexecise.repository;


import com.springAdvanced.Securityexecise.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
