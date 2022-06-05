package com.example.Vitalie.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="azienda")
public class Azienda {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long idAzienda;

    @Column(name="NOME")
    private String nomeAzienda;

    @Column(name="PASSWORD")
    private String passAzienda;

    @Column(name="REPARTO")
    private String reparto;



}
