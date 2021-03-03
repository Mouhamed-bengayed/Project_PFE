/*package pfe.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pfe.example.Entites.Categorie;
import pfe.example.Entites.Project;

import java.util.List;

@RestController
public class ModerateurController {

@Autowired
ModerateurController moderateurController;

@GetMapping("/liste/project")
public List<Project> getAllproject(){
   return moderateurController.getAllproject();
}
@GetMapping("/liste/categorie")
public List<Project> getAllcategorie(){
    return moderateurController.getAllcategorie();
}
@PostMapping("/add/categorie")
public void addcategorie(@RequestBody Categorie newcategorie){
    moderateurController.addcategorie(newcategorie);
}





}
*/