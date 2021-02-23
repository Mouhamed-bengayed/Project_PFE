package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.*;
import pfe.example.Entites.*;

import java.util.List;

@Service
public class ContributeurService {
    @Autowired
    ContibuteurRepository contibuteurRepository;
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    CatalogueRepository catalogueRepository;
    @Autowired
    CategorieRepository categorieRepository;
    @Autowired
    CommentaireRepository commentaireRepository;
    @Autowired
    MessageRepository messageRepository;
    @Autowired
    ReponseRepository reponseRepository;

    public List<Project> getAllProject() {
        catalogueRepository.findAll();
        return getAllProject();
    }

    public List<Categorie> getAllCategorie() {
        categorieRepository.findAll();
        return getAllCategorie();
    }

    public List<Project> getProjectByNom(String nom) {
        List<Project> lp = contibuteurRepository.findFirstByNom(nom);
        if (lp == null) throw new RuntimeException("nom n'est pas trouve");
        return lp;
    }

    public void getAllCommentaire() {
        commentaireRepository.findAll();
    }

    public void addCommentaire(Commentaire commentaire) {
        commentaireRepository.save(commentaire);
    }

    public void addMessage(Message message) {
        messageRepository.save(message);
    }

    public void reponseMessage(Reponse reponse) {
        reponseRepository.save(reponse);
    }

}
