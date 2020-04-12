package com.tstepnik.planner.repository;
import com.tstepnik.planner.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {

    UserRole findByRole(String role);
    Optional<UserRole> findById(Long id);
}
