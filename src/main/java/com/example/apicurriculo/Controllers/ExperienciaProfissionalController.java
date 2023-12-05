package com.example.apicurriculo.Controllers;

import com.example.apicurriculo.Entity.ExperienciaProfissional;
import com.example.apicurriculo.Repository.ExperienciaProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experiencia-profissional")
public class ExperienciaProfissionalController {
    private final ExperienciaProfissionalRepository experienciaProfissionalRepository;

    @Autowired
    public ExperienciaProfissionalController(ExperienciaProfissionalRepository experienciaProfissionalRepository) {
        this.experienciaProfissionalRepository = experienciaProfissionalRepository;
    }

    @GetMapping
    public List<ExperienciaProfissional> listarExperienciaProfissional() {
        return experienciaProfissionalRepository.findAll();
    }

    @PostMapping
    public ExperienciaProfissional criarExperienciaProfissional(@RequestBody ExperienciaProfissional experienciaProfissional) {
        return experienciaProfissionalRepository.save(experienciaProfissional);
    }

}
