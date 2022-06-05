package com.example.Vitalie.service;

import com.example.Vitalie.entity.Dichiarazione;
import com.example.Vitalie.repository.DichiarazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DichiarazioneService {

    DichiarazioneRepository repo;

    @Autowired
    public DichiarazioneService(DichiarazioneRepository repo) {
        this.repo = repo;
    }

    public Dichiarazione saveDichiarazione(Dichiarazione dichiarazione){
        return repo.save(dichiarazione);
    }

    public List<Dichiarazione> getAllDichirazioni(){
        return repo.findAll();
    }

    public List<Dichiarazione> getByStatus(String status){
        return repo.findDichirazioniByStatus(status);
    }


}
