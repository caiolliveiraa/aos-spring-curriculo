package com.example.apicurriculo.Service;

import com.example.apicurriculo.Entity.Habilidades;
import com.example.apicurriculo.Repository.HabilidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HabilidadesService {
    private final HabilidadesRepository habilidadeRepository;

    @Autowired
    public HabilidadesService(HabilidadesRepository habilidadeRepository) {
        this.habilidadeRepository = habilidadeRepository;
    }

    public List<Habilidades> listarTodas() {
        return habilidadeRepository.findAll();
    }

    public Habilidades buscarPorId(Long id) {
        return habilidadeRepository.findById(id).orElse(null);
    }

    public Habilidades criarHabilidade(Habilidades habilidade) {
        return habilidadeRepository.save(habilidade);
    }

    public Habilidades atualizarHabilidade(Long id, Habilidades habilidadeAtualizada) {
        habilidadeAtualizada.setId(id);
        return habilidadeRepository.save(habilidadeAtualizada);
    }

    public void deletarHabilidade(Long id) {
        habilidadeRepository.deleteById(id);
    }

}
