package com.weg.ProfessorCurso.dto.ProfessorDto;

import java.util.UUID;

public record ProfessorResponseDto (
        UUID id,
        String nomeProfessor,
        String materia
){
}
