package pfe.example.demo.Entites;

import lombok.Data;

import javax.persistence.*;

@Entity
@DiscriminatorValue("moderateur")
@Data
public class Moderateur extends Utilisateur {

}
