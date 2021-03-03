package pfe.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import pfe.example.demo.Dao.ProjectRepository;
import pfe.example.demo.Entites.Project;

import java.util.List;

public class Projectservice {
    @Autowired
    ProjectRepository projectRepository;

    public List<Project> getAllProject() {

        projectRepository.findAll();
        return getAllProject();
    }
}
