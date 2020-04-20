package com.tstepnik.planner.repository;
import com.tstepnik.planner.domain.user.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole,Long> {

    Optional<UserRole> findByRole(String role);
    Optional<UserRole> findById(Long id);
}
