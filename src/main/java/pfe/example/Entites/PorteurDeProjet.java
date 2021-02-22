package pfe.example.Entites;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("Porteur_p")
@Data
public class PorteurDeProjet extends Utilisateur {
   @ManyToOne
   private ListeNoir listeNoir;
   @OneToMany(mappedBy = "porteurDeProjet")
   private List<Project> project;


}
