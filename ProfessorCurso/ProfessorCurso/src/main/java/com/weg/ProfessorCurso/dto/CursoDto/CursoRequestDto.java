package com.weg.ProfessorCurso.dto.CursoDto;

import java.time.LocalDate;

public record CursoRequestDto (
        String nomeCurso,
        LocalDate duracaoCurso
){
}
