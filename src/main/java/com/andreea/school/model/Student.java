package com.andreea.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
//@Data- se creeaza metodele de get si set pentru fieldurile private
@Entity
public class Student {

    private String studentFirstName;
    private String studentLastName;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @ManyToOne(fetch = FetchType.LAZY)
    private SchoolGroup schoolGroup;
    @ManyToOne(fetch = FetchType.LAZY)
    private Professor professor;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Discipline> disciplines;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Grade> grades;



}
