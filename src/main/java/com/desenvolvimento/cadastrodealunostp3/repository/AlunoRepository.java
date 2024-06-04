package com.desenvolvimento.cadastrodealunostp3.repository;

import com.desenvolvimento.cadastrodealunostp3.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {
}
