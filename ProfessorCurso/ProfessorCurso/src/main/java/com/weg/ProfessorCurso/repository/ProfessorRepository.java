package com.weg.ProfessorCurso.repository;

import com.weg.ProfessorCurso.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfessorRepository extends JpaRepository<Professor , UUID> {
}
