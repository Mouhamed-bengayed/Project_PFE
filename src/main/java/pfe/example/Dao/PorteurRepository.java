package pfe.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfe.example.Entites.PorteurDeProjet;
@Repository
public interface PorteurRepository extends JpaRepository<PorteurDeProjet,Long> {

    void deleteById(long id);

}
