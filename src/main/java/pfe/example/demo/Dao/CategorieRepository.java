package pfe.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pfe.example.demo.Entites.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
