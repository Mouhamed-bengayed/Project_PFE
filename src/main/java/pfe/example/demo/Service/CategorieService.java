package pfe.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.demo.Dao.CategorieRepository;
import pfe.example.demo.Dao.ProjectRepository;
import pfe.example.demo.Entites.Categorie;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    CategorieRepository categorieRepository;

public List<Categorie> getAllCategories(){
    categorieRepository.findAll();
    return getAllCategories();
}




}
