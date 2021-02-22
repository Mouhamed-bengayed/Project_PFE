package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.*;
import pfe.example.Entites.*;

import java.util.List;

@Service
public class ContibuteurService {
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

    public List<Project> getAllproject() {
        catalogueRepository.findAll();
        return getAllproject();
    }

    public List<Categorie> getAllcategorie() {
        categorieRepository.findAll();
        return getAllcategorie();
    }

    public List<Project> getprojectbynom(String nom) {
        List<Project> lp = contibuteurRepository.findFirstByNom(nom);
        if (lp == null) throw new RuntimeException("nom n'est pas trouve");
        return lp;
    }

    public void getAllcommontaire() {
        commentaireRepository.findAll();
    }

    public void addcommantaire(Commentaire commentaire) {
        commentaireRepository.save(commentaire);
    }

    public void addmessage(Message message) {
        messageRepository.save(message);
    }

    public void reponsemessage(Reponse reponse) {
        reponseRepository.save(reponse);
    }

}
