package com.weg.ProfessorCurso.service;

import com.weg.ProfessorCurso.dto.ProfessorDto.ProfessorRequestDto;
import com.weg.ProfessorCurso.dto.ProfessorDto.ProfessorResponseDto;
import com.weg.ProfessorCurso.mapper.ProfessorMapper;
import com.weg.ProfessorCurso.model.Professor;
import com.weg.ProfessorCurso.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProfessorService {

    private final ProfessorRepository repository;
    private final ProfessorMapper mapper;

    public ProfessorResponseDto salvar (ProfessorRequestDto requestDto) {

        Professor professor = new Professor();

        return mapper.paraDto(repository.save(professor));
    }

    public List<ProfessorResponseDto> listarTodos () {
        return repository.findAll()
                .stream()
                .map(mapper::paraDto)
                .toList();
    }

    public ProfessorResponseDto listarPorId (UUID id) {
        Professor professor = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lista não encontrada"));

        return mapper.paraDto(professor);
    }

    public ProfessorResponseDto atualizar (ProfessorRequestDto requestDto , UUID id) {
        Professor professor = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado"));

        professor.setNomeProfessor(requestDto.nomeProfessor());
        professor.setMateria(requestDto.materia());

        return mapper.paraDto(professor);
    }

    public void deletar (UUID id ){
        repository.deleteById(id);
    }
}
