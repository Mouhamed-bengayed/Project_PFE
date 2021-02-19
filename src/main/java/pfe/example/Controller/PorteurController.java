package pfe.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pfe.example.Entites.Categorie;
import pfe.example.Entites.Project;
import pfe.example.Service.PorteurService;

import java.util.List;

public class PorteurController {

    @Autowired
    PorteurService porteurService;

@GetMapping("/liste/categorie")
    public List<Categorie> getAllCategorie(){
        porteurService.getAllcategorie();
        return getAllCategorie();
    }
@GetMapping("/add/Project")
public void addproject(@RequestParam Project p1){
    porteurService.addproject(p1);
}
@GetMapping("/Liste/catalogue")
public List<Project> getcatalogue(){
    porteurService.getcatalogue();
    return getcatalogue();
}

}
