package tn.spring.springproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Equipe {

    @Id
    private int idEquipte;
    private String nomEquipe;
    private Niveau niveau;

    public Equipe() {
    }

    public Equipe(int idEquipte, String nomEquipe, Niveau niveau) {
        this.idEquipte = idEquipte;
        this.nomEquipe = nomEquipe;
        this.niveau = niveau;
    }

    public int getIdEquipte() {
        return idEquipte;
    }

    public void setIdEquipte(int idEquipte) {
        this.idEquipte = idEquipte;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }
}
