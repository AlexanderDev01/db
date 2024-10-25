package com.sena.db;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;







@RestController
public class ApiRest {
    @Autowired
    DeportesRepository deportesRepository;
    
    @GetMapping("/listar/deportes")
    public List<Deportes> list() {
        return deportesRepository.findAll();
    }
    
    @GetMapping("/listar/{id}")
    public Optional <Deportes> listId(@PathVariable Integer id) {
        return deportesRepository.findById(id);
    }
    
    @GetMapping("/guardarDeporte/{id}/{nombre}")
    public String getGuardarDeporte(@PathVariable Integer id, @PathVariable String nombre) {
        return new String();
    }
    
}
