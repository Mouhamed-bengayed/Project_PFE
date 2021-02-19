package pfe.example.Entites;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Contribution {
    @Id
    private Long id;
    private Double montont;
    private Date datedecontrption;
    @ManyToOne
    private Project project;
    @ManyToOne
    private Contibuteur contibuteur;
}
