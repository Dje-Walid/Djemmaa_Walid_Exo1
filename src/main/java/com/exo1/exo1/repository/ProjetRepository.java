package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Projet;
import com.exo1.exo1.entity.Task;
import com.exo1.exo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
    @Query("SELECT p FROM Projet p LEFT JOIN FETCH p.tasks LEFT JOIN FETCH p.users WHERE p.id = :id")
    Optional<Projet> findById(@Param("id") Long id);

    @Query("SELECT p FROM Projet p LEFT JOIN FETCH p.tasks LEFT JOIN FETCH p.users")
    List<Projet> findAll();
}
