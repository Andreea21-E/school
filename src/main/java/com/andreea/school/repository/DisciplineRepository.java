package com.andreea.school.repository;

import com.andreea.school.model.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplineRepository extends JpaRepository <Discipline, Integer> {
}
