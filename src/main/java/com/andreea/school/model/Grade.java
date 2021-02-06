package com.andreea.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Grade {

    private double gradeNumber;
    private Date gradeDate;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gradeId;


    @ManyToOne( fetch = FetchType.LAZY)
    private Student student;

}
