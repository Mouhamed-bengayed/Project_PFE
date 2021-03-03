package pfe.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfe.example.demo.Entites.ListeNoir;

@Repository
public interface Listenoirrepository extends JpaRepository<ListeNoir,Long> {


}

