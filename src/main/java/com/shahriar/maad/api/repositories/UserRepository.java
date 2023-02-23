package com.shahriar.maad.api.repositories;

import com.shahriar.maad.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
