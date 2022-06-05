package com.example.Vitalie.controller;

import com.example.Vitalie.entity.Azienda;
import com.example.Vitalie.repository.AziendaRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class AziendaController {

    private final AziendaRepository repository;

    AziendaController(AziendaRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/azienda")
    Azienda nuovaAzienda(@RequestBody Azienda nuovaAzienda) {
        return repository.save(nuovaAzienda);
    }

    // Single item

    @GetMapping("/aziende/{id}")
    Azienda one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/employees/{id}")
    Azienda replaceAzienda(@RequestBody Azienda nuovaAzienda, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    azienda.setNomeAzienda(nuovaAzienda.getNomeAzienda());
                    azienda.setRole(nuovaAzienda.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    nuovaAzienda.setId(id);
                    return repository.save(nuovaAzienda);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteAzienda(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
