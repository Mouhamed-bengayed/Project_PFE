package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.ProjectRepository;
import pfe.example.Entites.Project;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    ProjectRepository projectRepository;

    public List<Project> getAllproject() {
        projectRepository.findAll();
        return getAllproject();

    }

}
