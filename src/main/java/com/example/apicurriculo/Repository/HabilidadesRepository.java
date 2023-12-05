package com.example.apicurriculo.Repository;

import com.example.apicurriculo.Entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HabilidadesRepository extends JpaRepository<Habilidades, Long> {
    List<Habilidades> findByNomeContainingIgnoreCase(String nome);

}


