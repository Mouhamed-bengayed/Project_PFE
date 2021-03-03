package pfe.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pfe.example.demo.Entites.Compte;

public interface CompteRepository extends JpaRepository<Compte,String> {

}
