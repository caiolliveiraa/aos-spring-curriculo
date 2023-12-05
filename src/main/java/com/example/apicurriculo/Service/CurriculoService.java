package com.example.apicurriculo.Service;

import com.example.apicurriculo.Entity.Curriculo;
import com.example.apicurriculo.Repository.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CurriculoService {
    private final CurriculoRepository curriculoRepository;

    @Autowired
    public CurriculoService(CurriculoRepository curriculoRepository) {
        this.curriculoRepository = curriculoRepository;
    }

    public List<Curriculo> listarTodas() {
        return curriculoRepository.findAll();
    }

    public Curriculo buscarPorId(Long id) {
        return curriculoRepository.findById(id).orElse(null);
    }

    public Curriculo criarCurriculo(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    public Curriculo atualizarCurriculo(Long id, Curriculo curriculoAtualizado) {
        curriculoAtualizado.setId(id);
        return curriculoRepository.save(curriculoAtualizado);
    }

    public void deletarCurriculo(Long id) {
        curriculoRepository.deleteById(id);
    }

}

