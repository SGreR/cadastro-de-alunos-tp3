package com.desenvolvimento.cadastrodealunostp3;

import com.desenvolvimento.cadastrodealunostp3.model.Aluno;
import com.desenvolvimento.cadastrodealunostp3.model.Curso;
import com.desenvolvimento.cadastrodealunostp3.repository.AlunoRepository;
import com.desenvolvimento.cadastrodealunostp3.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public void run(String... args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setNome("Inglês");

        Curso curso2 = new Curso();
        curso2.setNome("Português");

        cursoRepository.save(curso1);
        cursoRepository.save(curso2);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro");
        aluno1.setCursos(List.of(curso1, curso2));

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Ana");
        aluno2.setCursos(List.of(curso1));

        alunoRepository.save(aluno1);
        alunoRepository.save(aluno2);
    }
}

