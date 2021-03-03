package pfe.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pfe.example.demo.Entites.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    void deleteById(Long idutilisateur);

}
