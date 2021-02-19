package pfe.example.Entites;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data

public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numeroproject;
    private String nom;
    private String descrption;
private Date datedecreation;
    @ManyToOne
    private Categorie Categorie;

   @OneToMany(mappedBy = "project")
    private Collection<Vote> votes;
    @ManyToOne
    private Contribution contribution;
    @ManyToOne
    private PorteurDeProjet porteurDeProjet;



}
