package org.example.storeapi.domain.user;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UserRepository extends JpaRepository<Usuario, UUID> {
    UserDetails findByEmail(String email);
}
