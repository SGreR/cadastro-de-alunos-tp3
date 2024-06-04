package com.desenvolvimento.cadastrodealunostp3.controller;

import com.desenvolvimento.cadastrodealunostp3.model.Curso;
import com.desenvolvimento.cadastrodealunostp3.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> getAllCursos() {
        return cursoService.getAllCursos();
    }

    @GetMapping("/{id}")
    public Curso getCursoById(@PathVariable Long id) {
        return cursoService.getCursoById(id);
    }

    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        return cursoService.createCurso(curso);
    }

    @PutMapping("/{id}")
    public Curso updateCurso(@PathVariable Long id, @RequestBody Curso cursoDetails) {
        return cursoService.updateCurso(id, cursoDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCurso(@PathVariable Long id) {
        cursoService.deleteCurso(id);
    }
}

