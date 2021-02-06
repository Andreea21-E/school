package com.andreea.school.repository;

import com.andreea.school.model.Discipline;
import com.andreea.school.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository  extends JpaRepository<Grade, Integer> {
}
