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
@Id
    private String disciplineName;


@ManyToOne( fetch = FetchType.LAZY)
    private Student student;

}
