package pfe.example.Entites;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
@Entity
@Data
public class ListeNoir {
    @Id
private Long id;
    private String nom;

  @OneToMany(mappedBy = "listeNoir")
    private Collection<PorteurDeProjet> porteurdeprojets;
   @OneToMany(mappedBy = "listeNoir")
    private Collection<Contributeur> contibuteurs;


}
