package pfe.example.Entites;

import lombok.Data;


import javax.persistence.*;

import java.util.Collection;

@Entity
@DiscriminatorValue("contibuteur")
@Data
public class Contributeur extends Utilisateur {


    @ManyToOne
    private ListeNoir listeNoir;
    @OneToMany(mappedBy = "contributeur")
    private Collection<Contribution> contributions;
    @OneToMany(mappedBy = "contibuteur")
     private Collection<Vote>  votes;


}
