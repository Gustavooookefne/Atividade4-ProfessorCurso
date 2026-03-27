package com.weg.ProfessorCurso.repository;

import com.weg.ProfessorCurso.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso , Long> {
}
