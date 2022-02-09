package com.sigaBem.apiRest.repository;

import com.sigaBem.apiRest.models.Cep;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CepRepository extends JpaRepository<Cep, Long>{
    
}
