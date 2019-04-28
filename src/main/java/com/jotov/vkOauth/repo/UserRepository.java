package com.jotov.vkOauth.repo;

import com.jotov.vkOauth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
