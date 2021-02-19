package pfe.example.Entites;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@DiscriminatorValue("Porteur_p")
@Data
public class PorteurDeProjet extends Utilisateur {
   @ManyToOne
   private ListeNoir listeNoir;
   @ManyToOne
   private Project project;
   @ManyToOne
   private Contibuteur contibuteur;

}
