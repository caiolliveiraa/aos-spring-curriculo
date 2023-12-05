package com.example.apicurriculo.Controllers;

import com.example.apicurriculo.Entity.Habilidades;
import com.example.apicurriculo.Repository.HabilidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habilidades")
public class HabilidadesController {
    private final HabilidadesRepository habilidadeRepository;

    @Autowired
    public HabilidadesController(HabilidadesRepository habilidadeRepository) {
        this.habilidadeRepository = habilidadeRepository;
    }

    @GetMapping
    public List<Habilidades> listarHabilidades() {
        return habilidadeRepository.findAll();
    }

    @PostMapping
    public Habilidades criarHabilidade(@RequestBody Habilidades habilidade) {
        return habilidadeRepository.save(habilidade);
    }

}

