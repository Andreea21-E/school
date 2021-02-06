package com.andreea.school.repository;

import com.andreea.school.model.Discipline;
import com.andreea.school.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository  extends JpaRepository<Professor, Integer> {
}
