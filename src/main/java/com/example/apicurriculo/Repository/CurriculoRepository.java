package com.example.apicurriculo.Repository;

import com.example.apicurriculo.Entity.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    Curriculo findByNome(String nome);

}

