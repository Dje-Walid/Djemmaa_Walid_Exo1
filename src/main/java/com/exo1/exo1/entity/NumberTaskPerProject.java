package com.exo1.exo1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "number_task_per_project")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NumberTaskPerProject {
    @Id
    private Long projet;

    private String name;

    @Column(name = "number_tasks")
    private Long numberTasks;
}
