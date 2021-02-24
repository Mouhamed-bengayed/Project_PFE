package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.*;
import pfe.example.Entites.*;

import java.util.Collection;
import java.util.List;

@Service
public class Moderateursevice {
    @Autowired
    ModerateurRepository moderateurRepository;
    @Autowired
    CatalogueRepository catalogueRepository;
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    CategorieRepository categorieRepository;
    @Autowired
    PorteurRepository porteurRepository;
    @Autowired
    Listenoirrepository listenoirrepository;
    @Autowired
    ContibuteurRepository contibuteurRepository;

    public List<Project> getAllProject() {
        projectRepository.findAll();
        return getAllProject();
    }


    public List<Categorie> getAllCategorie() {
        categorieRepository.findAll();
        return getAllCategorie();
    }

    public void addCategorie(Categorie newcategorie) {
        categorieRepository.save(newcategorie);
    }

    public void bloquePorteur(Long id) {
        PorteurDeProject porteurDeProject = (PorteurDeProject) porteurRepository.findAllById(id);
        ListeNoir listeNoir=new ListeNoir();
        listeNoir.setPorteurdeprojets((Collection<PorteurDeProject>) porteurDeProject);
        listenoirrepository.save(listeNoir);
        //porteurRepository.deleteById(id);
    }

    public void bloqueContibuteur(Long id) {
        Contributeur contributeur = contibuteurRepository.getOne(id);
        ListeNoir listeNoir=new ListeNoir();
        listeNoir.setContibuteurs((Collection<Contributeur>) contributeur);
        listenoirrepository.save(listeNoir);

       // contibuteurRepository.deleteById(id);
    }

    public void activerPorteur(Long id) {

        //PorteurDeProjet porteurDeProjet=listenoirrepository.getOne(id);
        //porteurRepository.save(porteurDeProjet);
        listenoirrepository.deleteById(id);
    }

    public void activerContibuteur(Long id) {
        // Contributeur contributeur=listenoirrepository.getOne(id);
        //  contibuteurRepository.save(contributeur);
        listenoirrepository.deleteById(id);
    }


}

