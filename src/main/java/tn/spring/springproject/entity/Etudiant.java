package tn.spring.springproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Etudiant {
    @Id
    private int id;
    private String prenomE;
    private String nomE;
    private Option op;

    public Etudiant() {

    }

    public Etudiant(int id, String prenomE, String nomE, Option op) {
        this.id = id;
        this.prenomE = prenomE;
        this.nomE = nomE;
        this.op = op;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public Option getOp() {
        return op;
    }

    public void setOp(Option op) {
        this.op = op;
    }


}
