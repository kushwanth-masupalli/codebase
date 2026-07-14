package com.example.basicauth_demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.config.annotation.web.oauth2.resourceserver.OpaqueTokenDsl;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<AppUser,Long> {
   public Optional<AppUser> findByUsername(String username);
}
