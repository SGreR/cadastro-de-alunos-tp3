package com.desenvolvimento.cadastrodealunostp3.service;

import com.desenvolvimento.cadastrodealunostp3.model.Aluno;
import com.desenvolvimento.cadastrodealunostp3.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno getAlunoById(Long id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public Aluno createAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno updateAluno(Long id, Aluno alunoDetails) {
        Aluno aluno = alunoRepository.findById(id).orElse(null);
        if (aluno != null) {
            aluno.setNome(alunoDetails.getNome());
            aluno.setCursos(alunoDetails.getCursos());
            return alunoRepository.save(aluno);
        }
        return null;
    }

    public void deleteAluno(Long id) {
        alunoRepository.deleteById(id);
    }
}
