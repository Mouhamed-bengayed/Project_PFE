package pfe.example.Entites;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@DiscriminatorValue("contibuteur")
@Data
public class Contibuteur extends Utilisateur {


    @ManyToOne
    private ListeNoir listeNoir;
    @OneToMany
    private Collection<Contribution> contributions;
    @OneToMany
     private Collection<Vote>  votes;


}
