package pfe.example.Entites;

import javax.persistence.ManyToOne;

public class Message {
    @ManyToOne
    private Contibuteur contibuteur;
    @ManyToOne                             
    private PorteurDeProjet porteurDeProjet;
}
