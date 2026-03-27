package com.weg.ProfessorCurso.controller;

import com.weg.ProfessorCurso.dto.CursoDto.CursoRequestDto;
import com.weg.ProfessorCurso.dto.CursoDto.CursoResponseDto;
import com.weg.ProfessorCurso.service.CursoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/curso")
public class CursoController {

    private final CursoService service;

    @PutMapping
    public CursoResponseDto salvar (@RequestBody CursoRequestDto requestDto) {
        return service.salvar(requestDto);
    }

    @GetMapping
    public List<CursoResponseDto> listarTodos () {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public CursoResponseDto listarPorId(@PathVariable Long id) {
        return service.listarPorId(id);
    }

    @PostMapping("/{id}")
    public CursoResponseDto atualizar (@RequestBody CursoRequestDto requestDto, @PathVariable Long id) {
        return service.atualizar(requestDto , id);
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id) {
        service.deletar(id);
    }
}
