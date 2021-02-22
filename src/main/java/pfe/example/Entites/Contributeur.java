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
    @OneToMany
    private Collection<Contribution> contributions;
    @OneToMany
     private Collection<Vote>  votes;


}
