package com.arguelles;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Ciutada")
public class Ciutada implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ciutadaId", unique = true, nullable = false)
    private long ciutadaId;

    @Column(name = "ciutatId")
    private long ciutatId;

    @Column(name = "nom")
    private String nom;

    @Column(name = "cognom")
    private String cognom;

    @Column(name = "edat")
    private int edat;


    public Ciutada() {
    }

    public Ciutada(long ciutatId ,String nom, String cognom, int edat) {
        this.ciutatId = ciutatId;
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public long getCiutadaId() {
        return ciutadaId;
    }

    public void setCiutadaId(long ciutadaId) {
        this.ciutadaId = ciutadaId;
    }

    public long getCiutatId() {
        return ciutatId;
    }

    public void setCiutatId(long ciutatId) {
        this.ciutatId = ciutatId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nomCiutada) {
        this.nom = nomCiutada;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognomCiutada) {
        this.cognom = cognomCiutada;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edatCiutada) {
        this.edat = edatCiutada;
    }

    @Override
    public String toString() {
        return this.getNom() + " " + this.getCognom() + ", " + this.getEdat() + " - " + this.getCiutatId();
    }

    
}
