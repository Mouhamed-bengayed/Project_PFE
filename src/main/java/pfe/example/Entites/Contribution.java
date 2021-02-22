package pfe.example.Entites;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Contribution {
    @Id
    private Long id;
    private Double montant;
    private Date datedecontribution;
    @ManyToOne
    private Project project;
    @ManyToOne
    private Contributeur contributeur;
}
