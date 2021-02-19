package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.*;
import pfe.example.Entites.Categorie;
import pfe.example.Entites.Project;

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

public List<Project> getALLProject(){
  projectRepository.findAll();
  return getALLProject();
}
/*
public List<CatalogueProjet> getALLcatalogue(){
  catalogueRepository.findAll();
  return getALLcatalogue();
  }*/

public List<Categorie> getALLcateegorie(){
  categorieRepository.findAll();
return getALLcateegorie();
}

public void Addcategorie(Categorie newcategorie){
  categorieRepository.save(newcategorie);
}


public void Bloqueporteur(Long Id){

  //listenoirrepository.save();
  porteurRepository.deleteById(Id);
}
public void activerporteur(Long Id){

 // porteurRepository.save(Id);
  listenoirrepository.deleteById(Id);
}
  public void Bloquecontibuteur(Long Id){
   // listenoirrepository.save();
    porteurRepository.deleteById(Id);
  }
  public void activercontibuteur(Long Id){
   // porteurRepository.save();
    listenoirrepository.deleteById(Id);
  }





}

