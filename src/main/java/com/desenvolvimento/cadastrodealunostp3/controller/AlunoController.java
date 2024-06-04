package com.desenvolvimento.cadastrodealunostp3.controller;

import com.desenvolvimento.cadastrodealunostp3.model.Aluno;
import com.desenvolvimento.cadastrodealunostp3.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoService.getAllAlunos();
    }

    @GetMapping("/{id}")
    public Aluno getAlunoById(@PathVariable Long id) {
        return alunoService.getAlunoById(id);
    }

    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoService.createAluno(aluno);
    }

    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno alunoDetails) {
        return alunoService.updateAluno(id, alunoDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Long id) {
        alunoService.deleteAluno(id);
    }
}

