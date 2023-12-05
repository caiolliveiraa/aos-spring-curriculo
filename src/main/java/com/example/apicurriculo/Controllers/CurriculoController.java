package com.example.apicurriculo.Controllers;

import com.example.apicurriculo.Entity.Curriculo;
import com.example.apicurriculo.Repository.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/curriculos")
public class CurriculoController {
    private final CurriculoRepository curriculoRepository;

    @Autowired
    public CurriculoController(CurriculoRepository curriculoRepository) {
        this.curriculoRepository = curriculoRepository;
    }

    @GetMapping
    public List<Curriculo> listarCurriculos() {
        return curriculoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Curriculo> buscarCurriculoPorId(@PathVariable Long id) {
        return curriculoRepository.findById(id);
    }

    @PostMapping
    public Curriculo criarCurriculo(@RequestBody Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    @PutMapping("/{id}")
    public Curriculo atualizarCurriculo(@PathVariable Long id, @RequestBody Curriculo curriculoAtualizado) {
        curriculoAtualizado.setId(id);
        return curriculoRepository.save(curriculoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletarCurriculo(@PathVariable Long id) {
        curriculoRepository.deleteById(id);
    }
}

