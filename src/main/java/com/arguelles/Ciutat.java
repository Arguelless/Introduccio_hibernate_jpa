package com.arguelles;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "Ciutat")
public class Ciutat implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ciutatId", unique = true, nullable = false)
    private long ciutatId;

    @Column(name = "nom")
    private String nom;

    @Column(name = "pais")
    private String pais;

    @Column(name = "codiPostal")
    private int codiPostal;

    public Ciutat() {
    }

    public Ciutat(String nom, String pais, int codiPostal) {
        this.nom = nom;
        this.pais = pais;
        this.codiPostal = codiPostal;

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

    public void setNom(String nomCiutat) {
        this.nom = nomCiutat;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String paisCiutat) {
        this.pais = paisCiutat;
    }

    public int getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(int codiPostalCiutat) {
        this.codiPostal = codiPostalCiutat;
    }

    @Override
    public String toString() {
        return this.getNom() + ", " + this.getPais() + " " + this.getCodiPostal();
    }

}
