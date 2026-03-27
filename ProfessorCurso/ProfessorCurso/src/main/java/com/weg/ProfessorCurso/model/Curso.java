package com.weg.ProfessorCurso.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_curso", nullable = false)
    private String nomeCurso;

    @Column(name = "duração_curso", nullable = false)
    private LocalDate duracaoCurso;

    public Curso(String s, LocalDate localDate) {
    }
}
