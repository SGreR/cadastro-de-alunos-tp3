package com.desenvolvimento.cadastrodealunostp3.service;

import com.desenvolvimento.cadastrodealunostp3.model.Curso;
import com.desenvolvimento.cadastrodealunostp3.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    @Cacheable(value="cursos")
    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    @Cacheable(value="cursos", key="#id")
    public Curso getCursoById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public Curso createCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @CacheEvict(value="cursos", key="#id")
    public Curso updateCurso(Long id, Curso cursoDetails) {
        Curso curso = cursoRepository.findById(id).orElse(null);
        if (curso != null) {
            curso.setNome(cursoDetails.getNome());
            curso.setAlunos(cursoDetails.getAlunos());
            return cursoRepository.save(curso);
        }
        return null;
    }

    @CacheEvict(value="cursos", key="#id")
    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}
