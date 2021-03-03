package pfe.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.*;

import pfe.example.demo.Dao.CategorieRepository;
import pfe.example.demo.Dao.CommentaireRepository;
import pfe.example.demo.Dao.MessageRepository;
import pfe.example.demo.Dao.ProjectRepository;
import pfe.example.demo.Entites.Message;
import pfe.example.demo.Entites.Project;

@Service
public class PorteurService {

    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    CategorieRepository categorieRepository;
    @Autowired
    CommentaireRepository commentaireRepository;

    @Autowired
    MessageRepository messageRepository;

    public Project addProject(Project newproject) {
        return projectRepository.save(newproject);
    }


    public void getAllCategories() {
        categorieRepository.findAll();
    }

    public void getAllProject() {
        projectRepository.findAll();
    }

    public void deleteProject(long id) {
        ProjectRepository.deleteById(id);
    }

    public void getAllCommentaires() {
        commentaireRepository.findAll();
    }

    public void addMessages(Message message) {
        messageRepository.save(message);
    }

}
