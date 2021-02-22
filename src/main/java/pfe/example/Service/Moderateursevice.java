package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.*;
import pfe.example.Entites.Categorie;
import pfe.example.Entites.PorteurDeProjet;
import pfe.example.Entites.Project;
import pfe.example.Entites.Contributeur;
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

public List<Project> getALLProject(){
  projectRepository.findAll();
  return getALLProject();
}


public List<Categorie> getALLcateegorie(){
  categorieRepository.findAll();
return getALLcateegorie();
}
public void addCategorie(Categorie newcategorie){
  categorieRepository.save(newcategorie);
}

public void bloquePorteur(Long id){
    PorteurDeProjet porteurDeProjet=porteurRepository.getOne(id);
    listenoirrepository.save(porteurDeProjet);
    porteurRepository.deleteById(id);
}
public void bloqueContibuteur(Long id){
    Contributeur contributeur=contibuteurRepository.getOne(id);
    listenoirrepository.save(contributeur);
    contibuteurRepository.deleteById(id);
  }
public void activerporteur(Long id){

    PorteurDeProjet porteurDeProjet=listenoirrepository.getOne(id);
    porteurRepository.save(porteurDeProjet);
    listenoirrepository.deleteById(id);
}
  public void activercontibuteur(Long id){
    Contributeur contributeur=listenoirrepository.getOne(id);
    contibuteurRepository.save(contributeur);
    listenoirrepository.deleteById(id);
  }





}

