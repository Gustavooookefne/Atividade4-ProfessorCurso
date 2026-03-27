package com.weg.ProfessorCurso.controller;

import com.weg.ProfessorCurso.dto.ProfessorDto.ProfessorRequestDto;
import com.weg.ProfessorCurso.dto.ProfessorDto.ProfessorResponseDto;
import com.weg.ProfessorCurso.service.ProfessorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/professor")
public class ProfessorController {

    private final ProfessorService service;

    @PutMapping
    public ProfessorResponseDto salvar (@RequestBody ProfessorRequestDto requestDto) {
        return service.salvar(requestDto);
    }
    @GetMapping
    public List<ProfessorResponseDto> listarTodos () {
        return service.listarTodos();
    }
    @GetMapping("/{id}")
    public ProfessorResponseDto listarPorId (@PathVariable UUID id) {
        return service.listarPorId(id);
    }
    @PostMapping("/{id}")
    public ProfessorResponseDto atualizar (@RequestBody ProfessorRequestDto requestDto , @PathVariable UUID id) {
        return service.atualizar(requestDto , id);
    }
    @DeleteMapping("/{id}")
    public void deletar (@PathVariable UUID id){
        service.deletar(id);
    }
}
