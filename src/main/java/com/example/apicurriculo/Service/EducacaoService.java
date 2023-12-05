package com.example.apicurriculo.Service;

import com.example.apicurriculo.Entity.Educacao;
import com.example.apicurriculo.Repository.EducacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EducacaoService {
    private final EducacaoRepository educacaoRepository;

    @Autowired
    public EducacaoService(EducacaoRepository educacaoRepository) {
        this.educacaoRepository = educacaoRepository;
    }

    public List<Educacao> listarTodas() {
        return educacaoRepository.findAll();
    }

    public Educacao buscarPorId(Long id) {
        return educacaoRepository.findById(id).orElse(null);
    }

    public Educacao criarEducacao(Educacao educacao) {
        return educacaoRepository.save(educacao);
    }

    public Educacao atualizarEducacao(Long id, Educacao educacaoAtualizada) {
        educacaoAtualizada.setId(id);
        return educacaoRepository.save(educacaoAtualizada);
    }

    public void deletarEducacao(Long id) {
        educacaoRepository.deleteById(id);
    }

    public List<Educacao> encontrarPorAnoConclusaoMaiorQue(int ano) {
        return educacaoRepository.findByAnoConclusaoGreaterThan(ano);
    }
}

