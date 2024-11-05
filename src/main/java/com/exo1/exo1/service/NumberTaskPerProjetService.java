package com.exo1.exo1.service;

import com.exo1.exo1.repository.NumberTaskPerProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NumberTaskPerProjetService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createMaterializedView() {
        String sql = "CREATE MATERIALIZED VIEW number_task_per_project AS " +
                "SELECT p.projet_id, p.name, COUNT(*) AS number_tasks " +
                "FROM Projet p " +
                "GROUP BY p.projet_id, p.name";
        jdbcTemplate.execute(sql);
    }
}
