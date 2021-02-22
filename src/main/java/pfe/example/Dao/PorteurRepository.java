package pfe.example.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfe.example.Entites.PorteurDeProject;
@Repository
public interface PorteurRepository extends JpaRepository<PorteurDeProject,Long> {

    void deleteById(long id);

}
