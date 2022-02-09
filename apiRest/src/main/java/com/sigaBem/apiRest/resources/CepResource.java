package com.sigaBem.apiRest.resources;

import java.util.List;

import com.sigaBem.apiRest.models.Cep;
import com.sigaBem.apiRest.repository.CepRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/api")
public class CepResource {

    @Autowired
    CepRepository cepRepository;
    
    @GetMapping("/fretes")
    public List<Cep> listaFretes(){
        return cepRepository.findAll();
    }

    @PostMapping("/fretes")
    public Cep salvarCep(@RequestBody Cep cep){
        

        return cepRepository.save(cep);
    }
}
