package com.progetto.springboot.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Listino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Aggiunta della chiave primaria

    private String marca;
    private String modello;
    private String chilometri;
    private String prezzo;

    public Listino() {
        this.marca = "N/D";
        this.modello = "N/D";
        this.chilometri = "N/D";
        this.prezzo = "N/D";
    }

    public Listino(String marca, String modello, String chilometri, String prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.chilometri = chilometri;
        this.prezzo = prezzo;
    }

    // Getter e setter, incluso per 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getChilometri() {
        return chilometri;
    }

    public void setChilometri(String chilometri) {
        this.chilometri = chilometri;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Listino{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", chilometri='" + chilometri + '\'' +
                ", prezzo='" + prezzo + '\'' +
                '}';
    }
}