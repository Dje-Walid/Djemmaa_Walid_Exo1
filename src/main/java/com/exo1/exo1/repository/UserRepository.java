package com.exo1.exo1.repository;

import com.exo1.exo1.entity.User;
import io.micrometer.common.lang.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u LEFT JOIN FETCH u.task LEFT JOIN FETCH u.projets WHERE u.id = :id")
    Optional<User> findById(@Param("id") Long id);

    @Query("SELECT u FROM User u LEFT JOIN FETCH u.task LEFT JOIN FETCH u.projets")
    Page<User> findAll(Pageable pageable);

}
