package com.example.Vitalie.controller;

import com.example.Vitalie.dto.DichiarazioneDto;
import com.example.Vitalie.entity.Azienda;
import com.example.Vitalie.entity.Dichiarazione;
import com.example.Vitalie.service.DichiarazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DichirazioneController {

    private DichiarazioneService dichiarazioneService;

    @Autowired
    public DichirazioneController(DichiarazioneService dichiarazioneService) {
        this.dichiarazioneService = dichiarazioneService;
    }

    @PostMapping("/dichiarazione")
    ResponseEntity<Dichiarazione> nuovaDichiarazione(@RequestBody DichiarazioneDto dto) {

        Dichiarazione dichiarazione = new Dichiarazione(dto);

        return ResponseEntity.ok(dichiarazioneService.saveDichiarazione(dichiarazione));
    }

    @PostMapping("/dichiarazione")
    ResponseEntity<Dichiarazione> nuovoStatusDichiarazione(@RequestBody DichiarazioneDto dto) {

        Dichiarazione dichiarazione = new Dichiarazione(dto);

        return ResponseEntity.ok(dichiarazioneService.saveDichiarazione(dichiarazione));
    }

    @GetMapping("/getDichirazione/{status}")
    ResponseEntity<List<Dichiarazione>> getInviateDichirazioni(){
        return ResponseEntity.ok(dichiarazioneService.getByStatus("inviata"));
    }



}
