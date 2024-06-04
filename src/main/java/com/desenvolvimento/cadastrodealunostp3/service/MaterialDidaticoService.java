package com.desenvolvimento.cadastrodealunostp3.service;

import com.desenvolvimento.cadastrodealunostp3.model.MaterialDidatico;
import com.desenvolvimento.cadastrodealunostp3.repository.MaterialDidaticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaterialDidaticoService {

    @Autowired
    private MaterialDidaticoRepository materialDidaticoRepository;

    public List<MaterialDidatico> getAllMaterials() {
        return materialDidaticoRepository.findAll();
    }

    public MaterialDidatico getMaterialById(String id) {
        return materialDidaticoRepository.findById(id).orElse(null);
    }

    public MaterialDidatico createMaterial(MaterialDidatico material) {
        return materialDidaticoRepository.save(material);
    }

    public MaterialDidatico updateMaterial(String id, MaterialDidatico materialDetails) {
        MaterialDidatico material = materialDidaticoRepository.findById(id).orElse(null);
        if (material != null) {
            material.setNome(materialDetails.getNome());
            material.setDescricao(materialDetails.getDescricao());
            return materialDidaticoRepository.save(material);
        }
        return null;
    }

    public void deleteMaterial(String id) {
        materialDidaticoRepository.deleteById(id);
    }
}

