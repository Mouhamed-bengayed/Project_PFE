package pfe.example.Entites;


import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String nom;
    private String prenom;
    private String email;
    private String password;

    @OneToMany(mappedBy = "utilisateur")
    private Collection<Comptes> comptes;


    public Utilisateur() {

    }
}
