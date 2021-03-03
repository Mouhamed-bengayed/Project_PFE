package pfe.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pfe.example.demo.Entites.Commentaire;
public interface CommentaireRepository extends JpaRepository<Commentaire,Long> {

}
