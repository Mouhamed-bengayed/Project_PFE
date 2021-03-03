package pfe.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfe.example.demo.Entites.PorteurDeProject;

import java.util.List;

@Repository
public interface PorteurRepository extends JpaRepository<PorteurDeProject,Long> {

    void deleteById(long id);

    List<PorteurDeProject> findAllById(Long id);
}
