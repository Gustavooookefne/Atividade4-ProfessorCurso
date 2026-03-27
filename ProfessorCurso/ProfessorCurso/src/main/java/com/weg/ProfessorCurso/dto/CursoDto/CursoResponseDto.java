package com.weg.ProfessorCurso.dto.CursoDto;

import java.time.LocalDate;

public record CursoResponseDto (
        Long id,
        String nomeCurso,
        LocalDate duracaoCurso
){
}
