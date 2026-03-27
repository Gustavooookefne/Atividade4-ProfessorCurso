package com.weg.ProfessorCurso.mapper;

import com.weg.ProfessorCurso.dto.ProfessorDto.ProfessorRequestDto;
import com.weg.ProfessorCurso.dto.ProfessorDto.ProfessorResponseDto;
import com.weg.ProfessorCurso.model.Professor;
import jakarta.persistence.Column;
import org.springframework.stereotype.Component;

@Component
public class ProfessorMapper {

    public Professor paraEntidades (ProfessorRequestDto requestDto) {
        return new Professor(
                requestDto.nomeProfessor(),
                requestDto.materia()
        );
    }

    public ProfessorResponseDto paraDto (Professor professor) {
        return new ProfessorResponseDto(
                professor.getId(),
                professor.getNomeProfessor(),
                professor.getMateria()
        );
    }
}
