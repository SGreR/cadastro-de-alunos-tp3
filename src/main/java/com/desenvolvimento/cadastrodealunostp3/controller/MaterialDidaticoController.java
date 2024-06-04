package com.desenvolvimento.cadastrodealunostp3.controller;

import com.desenvolvimento.cadastrodealunostp3.model.MaterialDidatico;
import com.desenvolvimento.cadastrodealunostp3.service.MaterialDidaticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materiais")
public class MaterialDidaticoController {

    @Autowired
    private MaterialDidaticoService materialDidaticoService;

    @GetMapping
    public List<MaterialDidatico> getAllMateriais() {
        return materialDidaticoService.getAllMaterials();
    }

    @GetMapping("/{id}")
    public MaterialDidatico getMaterialById(@PathVariable String id) {
        return materialDidaticoService.getMaterialById(id);
    }

    @PostMapping
    public MaterialDidatico createMaterial(@RequestBody MaterialDidatico material) {
        return materialDidaticoService.createMaterial(material);
    }

    @PutMapping("/{id}")
    public MaterialDidatico updateMaterial(@PathVariable String id, @RequestBody MaterialDidatico materialDetails) {
        return materialDidaticoService.updateMaterial(id, materialDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteMaterial(@PathVariable String id) {
        materialDidaticoService.deleteMaterial(id);
    }
}

