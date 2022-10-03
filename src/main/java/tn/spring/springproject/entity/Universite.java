package tn.spring.springproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Universite {

    @Id
    private int idUnity;
    private String nomUniv;

    public Universite() {
    }

    public Universite(int idUnity, String nomUniv) {
        this.idUnity = idUnity;
        this.nomUniv = nomUniv;
    }

    public int getIdUnity() {
        return idUnity;
    }

    public void setIdUnity(int idUnity) {
        this.idUnity = idUnity;
    }

    public String getNomUniv() {
        return nomUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }
}
