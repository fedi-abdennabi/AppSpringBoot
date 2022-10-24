package tn.spring.springproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode

public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipte;
    private String nomEquipe;
    private Niveau niveau;


    @OneToOne
    private DetailEquipe detailEquipe;


    @ManyToMany(mappedBy="equipes", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
