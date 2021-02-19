package pfe.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pfe.example.Entites.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Long, Utilisateur> {
    void deleteById(Long idutilisateur);

}
