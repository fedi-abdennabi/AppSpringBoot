package tn.spring.springproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode

public class DetailEquipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salle;
    private String thematique;

    @OneToOne(mappedBy="detailEquipe")
    private Equipe equipe;


}
