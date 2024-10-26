package com.sena.db;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;








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
    
    @PostMapping("/deporte/save")
    public void postDeporteSave(@RequestBody Deportes deportes) {
        deportesRepository.save(deportes) ;
    }
    
    
   
    
}
