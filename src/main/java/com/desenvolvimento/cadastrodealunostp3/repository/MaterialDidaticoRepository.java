package com.desenvolvimento.cadastrodealunostp3.repository;

import com.desenvolvimento.cadastrodealunostp3.model.MaterialDidatico;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MaterialDidaticoRepository extends MongoRepository<MaterialDidatico, String> {
}

