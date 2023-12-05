package com.example.apicurriculo.Service;

import com.example.apicurriculo.Entity.ExperienciaProfissional;
import com.example.apicurriculo.Repository.ExperienciaProfissionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExperienciaProfissionalService {
    private final ExperienciaProfissionalRepository experienciaProfissionalRepository;

    @Autowired
    public ExperienciaProfissionalService(ExperienciaProfissionalRepository experienciaProfissionalRepository) {
        this.experienciaProfissionalRepository = experienciaProfissionalRepository;
    }

    public List<ExperienciaProfissional> listarTodas() {
        return experienciaProfissionalRepository.findAll();
    }

    public ExperienciaProfissional buscarPorId(Long id) {
        return experienciaProfissionalRepository.findById(id).orElse(null);
    }

    public ExperienciaProfissional criarExperienciaProfissional(ExperienciaProfissional experienciaProfissional) {
        return experienciaProfissionalRepository.save(experienciaProfissional);
    }

    public ExperienciaProfissional atualizarExperienciaProfissional(Long id, ExperienciaProfissional experienciaProfissionalAtualizada) {
        experienciaProfissionalAtualizada.setId(id);
        return experienciaProfissionalRepository.save(experienciaProfissionalAtualizada);
    }

    public void deletarExperienciaProfissional(Long id) {
        experienciaProfissionalRepository.deleteById(id);
    }

}

