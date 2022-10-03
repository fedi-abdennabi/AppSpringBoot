package tn.spring.springproject.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Contrat {
    @Id
    private int idContrat;
    private Date dateDebutContrat;
    private Date dateFinContrat;
    private Specialite specialite;
    private boolean archive;

    public Contrat() {
    }

    public Contrat(int idContrat, Date dateDebutContrat, Date dateFinContrat, Specialite specialite, boolean archive) {
        this.idContrat = idContrat;
        this.dateDebutContrat = dateDebutContrat;
        this.dateFinContrat = dateFinContrat;
        this.specialite = specialite;
        this.archive = archive;
    }

    public int getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }
}
