package com.example.apicurriculo.Controllers;

import com.example.apicurriculo.Entity.Educacao;
import com.example.apicurriculo.Repository.EducacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/educacao")
public class EducacaoController {
    private final EducacaoRepository educacaoRepository;

    @Autowired
    public EducacaoController(EducacaoRepository educacaoRepository) {
        this.educacaoRepository = educacaoRepository;
    }

    @GetMapping
    public List<Educacao> listarEducacao() {
        return educacaoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Educacao> buscarEducacaoPorId(@PathVariable Long id) {
        return educacaoRepository.findById(id);
    }

    @PostMapping
    public Educacao criarEducacao(@RequestBody Educacao educacao) {
        return educacaoRepository.save(educacao);
    }

    @PutMapping("/{id}")
    public Educacao atualizarEducacao(@PathVariable Long id, @RequestBody Educacao educacaoAtualizada) {
        educacaoAtualizada.setId(id);
        return educacaoRepository.save(educacaoAtualizada);
    }

    @DeleteMapping("/{id}")
    public void deletarEducacao(@PathVariable Long id) {
        educacaoRepository.deleteById(id);
    }
}


