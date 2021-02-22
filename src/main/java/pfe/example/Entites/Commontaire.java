package pfe.example.Entites;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
public class Commontaire  implements Serializable {
    @Id
private Long id;
private Date datecommontaire;
private String commontaire;


    @ManyToOne
    private Contributeur contibuteur;
    @ManyToOne
    private Project project;
    @OneToMany(mappedBy = "commontaire")
    private Collection<Reponse> reponses;

}
