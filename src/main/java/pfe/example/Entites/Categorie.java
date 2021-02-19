package pfe.example.Entites;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@DiscriminatorValue("categorieP")
@Data
public class Categorie implements Serializable {
  @Id @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String nom;

@OneToMany(mappedBy = "Categorie",fetch = FetchType.LAZY)
  private List<Project> project;

}
