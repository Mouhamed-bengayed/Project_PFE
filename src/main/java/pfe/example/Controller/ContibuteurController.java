package pfe.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pfe.example.Entites.Project;
import pfe.example.Service.ContibuteurService;

import java.util.List;

@RestController
public class ContibuteurController {
@Autowired
    ContibuteurService contibuteurService;
/*
@GetMapping("/liste/categorie")
public List<Categorie> getAllcategorie(Model model1){
   List<Categorie> categorie=contibuteurService.getAllcategorie();
   model1.addAllAttributes('Liste de categorie',categorie);
    return categorie;
}*/

@GetMapping("/liste/project")
public List<Project> getAllProject(){
    contibuteurService.getAllproject();
    return getAllProject();
}



}
