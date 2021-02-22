package pfe.example.Entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Message {
    @Id
    private Long id;
    @ManyToOne
    private Contributeur contributeur;
    @ManyToOne                             
    private PorteurDeProjet porteurDeProjet;
}
