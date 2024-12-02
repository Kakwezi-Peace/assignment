package com.hotel_mgt_system.hotel_mgt_system.repo;

import com.hotel_mgt_system.hotel_mgt_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
