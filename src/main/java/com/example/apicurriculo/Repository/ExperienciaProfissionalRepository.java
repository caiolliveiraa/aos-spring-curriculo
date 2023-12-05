package com.example.apicurriculo.Repository;

import com.example.apicurriculo.Entity.ExperienciaProfissional;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExperienciaProfissionalRepository extends JpaRepository<ExperienciaProfissional, Long> {
    List<ExperienciaProfissional> findByEmpresa(String empresa);

}

