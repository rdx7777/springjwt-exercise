package io.github.rdx7777.springjwt.repository;

import io.github.rdx7777.springjwt.model.ERole;
import io.github.rdx7777.springjwt.model.Role;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
