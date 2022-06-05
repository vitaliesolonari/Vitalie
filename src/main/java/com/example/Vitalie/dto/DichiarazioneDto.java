package com.example.Vitalie.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
public class DichiarazioneDto {


    public Long idDichiarazione;

    public LocalDateTime dataCreazione;

    public String status;

    public Long idAzienda;

}
