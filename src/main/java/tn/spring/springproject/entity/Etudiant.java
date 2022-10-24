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

public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String prenomE;
    private String nomE;
    private Option op;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

    @OneToMany(cascade = CascadeType.ALL , mappedBy="etudiant")
    private Set<Contrat> Contrats;

    @ManyToOne
    Departement Departement;


}
