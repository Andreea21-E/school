package com.andreea.school.repository;


import com.andreea.school.model.SchoolGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolGroupRepository  extends JpaRepository<SchoolGroup, Integer> {
}
