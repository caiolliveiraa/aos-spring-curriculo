package com.example.apicurriculo.Repository;

import com.example.apicurriculo.Entity.Educacao;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface EducacaoRepository extends JpaRepository<Educacao, Long> {
    List<Educacao> findByAnoConclusaoGreaterThan(int ano);

}


