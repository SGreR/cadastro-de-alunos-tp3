package com.desenvolvimento.cadastrodealunostp3.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "materiais")
@Data
public class MaterialDidatico {
    @Id
    private String id;
    private String nome;
    private String descricao;
}

