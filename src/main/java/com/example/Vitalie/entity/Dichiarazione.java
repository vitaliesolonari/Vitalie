package com.example.Vitalie.entity;

import com.example.Vitalie.dto.DichiarazioneDto;
import com.sun.xml.bind.v2.model.core.EnumConstant;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
public class Dichiarazione {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long idDichiarazione;

    @Column(name="DATA_CREAZIONE")
    private LocalDateTime dataCreazione;

    @Column(name="STATUS")
    private String status;

    @Column(name="ID_AZIENDA")
    private Long idAzienda;

    public Dichiarazione(DichiarazioneDto dto) {
        this.idDichiarazione=dto.idDichiarazione;
        this.dataCreazione=dto.dataCreazione;
        this.status=dto.status;
        this.idAzienda=dto.idAzienda;
    }
}
