package com.andreea.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Discipline {
    private String disciplineName;

    @Id
    private int disciplineNumber;


@ManyToOne( fetch = FetchType.LAZY)
    private Student student;

}
