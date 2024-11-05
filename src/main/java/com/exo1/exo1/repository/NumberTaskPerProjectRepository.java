package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberTaskPerProjectRepository extends JpaRepository<Projet, Long> {
}
