package com.weg.ProfessorCurso.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome_professor", nullable = false)
    private String nomeProfessor;

    @Column(name = "materia", nullable = false)
    private String materia;

    @OneToMany(mappedBy = "pofessor", cascade = CascadeType.ALL)
    private List<Curso> cursos = new ArrayList<>();

    public Professor(String s, String materia) {
    }
}
