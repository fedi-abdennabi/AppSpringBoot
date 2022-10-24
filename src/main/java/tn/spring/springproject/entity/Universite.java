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

public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUnity;
    private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> Departements;


}
