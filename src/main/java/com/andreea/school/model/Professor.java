package com.andreea.school.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Professor {
    private String professorFirstName;
    private String professorLastName;
    private String specialization;

    @Id
    private int professorId;


    @OneToMany (mappedBy = "professor", cascade = CascadeType.ALL)
    private List<Student> students;
}
