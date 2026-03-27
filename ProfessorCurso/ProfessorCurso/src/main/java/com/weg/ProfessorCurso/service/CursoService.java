package com.weg.ProfessorCurso.service;

import com.weg.ProfessorCurso.dto.CursoDto.CursoRequestDto;
import com.weg.ProfessorCurso.dto.CursoDto.CursoResponseDto;
import com.weg.ProfessorCurso.mapper.CursoMapper;
import com.weg.ProfessorCurso.model.Curso;
import com.weg.ProfessorCurso.repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CursoService {

    private final CursoRepository repository;
    private final CursoMapper mapper;

    public CursoResponseDto salvar (CursoRequestDto requestDto) {

        Curso curso = new Curso();

        return mapper.paraDto(repository.save(curso));
    }

    public List<CursoResponseDto> listarTodos () {
        return repository.findAll()
                .stream()
                .map(mapper::paraDto)
                .toList();
    }

    public CursoResponseDto listarPorId (Long id) {
        Curso curso = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lista não encontrada"));

        return mapper.paraDto(curso);
    }

    public CursoResponseDto atualizar (CursoRequestDto requestDto , Long id) {
        Curso curso = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso não encontrado"));

        curso.setNomeCurso(requestDto.nomeCurso());
        curso.setDuracaoCurso(requestDto.duracaoCurso());

        return mapper.paraDto(curso);

    }

    public void deletar (Long id) {
        repository.deleteById(id);
    }
}
