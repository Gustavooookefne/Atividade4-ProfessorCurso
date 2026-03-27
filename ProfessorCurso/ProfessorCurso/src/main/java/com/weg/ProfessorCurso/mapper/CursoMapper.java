package com.weg.ProfessorCurso.mapper;

import com.weg.ProfessorCurso.dto.CursoDto.CursoRequestDto;
import com.weg.ProfessorCurso.dto.CursoDto.CursoResponseDto;
import com.weg.ProfessorCurso.model.Curso;
import org.springframework.stereotype.Component;

@Component
public class CursoMapper {

    public Curso paraEntidades (CursoRequestDto requestDto) {
        return new Curso(
                requestDto.nomeCurso(),
                requestDto.duracaoCurso()
        );
    }

    public CursoResponseDto paraDto (Curso curso) {
        return new CursoResponseDto(
                curso.getId(),
                curso.getNomeCurso(),
                curso.getDuracaoCurso()
        );
    }
}
