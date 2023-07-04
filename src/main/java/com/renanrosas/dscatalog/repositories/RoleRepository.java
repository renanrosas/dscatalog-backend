package com.renanrosas.dscatalog.repositories;

import com.renanrosas.dscatalog.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
