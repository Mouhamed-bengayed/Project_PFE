package pfe.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pfe.example.Entites.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
