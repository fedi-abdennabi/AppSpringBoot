package tn.spring.springproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetailEquipe {

    @Id
    private int salle;
    private String thematique;

    public DetailEquipe() {
    }

    public DetailEquipe(int salle, String thematique) {
        this.salle = salle;
        this.thematique = thematique;
    }

    public int getSalle() {
        return salle;
    }

    public void setSalle(int salle) {
        this.salle = salle;
    }

    public String getThematique() {
        return thematique;
    }

    public void setThematique(String thematique) {
        this.thematique = thematique;
    }
}
