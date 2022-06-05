package com.example.Vitalie.repository;

import com.example.Vitalie.entity.Dichiarazione;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DichiarazioneRepository extends CrudRepository<Dichiarazione, Long> {

    @Query("SELECT d FROM DICHIRAZIONE d")
    List<Dichiarazione> findAll();

    @Query("SELECT d FROM DICHIRAZIONE d WHERE d.status = :status")
    List<Dichiarazione> findDichirazioniByStatus(@Param("status") String status);

}
