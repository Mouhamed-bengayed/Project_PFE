package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.ContibuteurRepository;
import pfe.example.Dao.PorteurRepository;
import pfe.example.Dao.ProjectRepository;
import pfe.example.Dao.UtilisateurRepository;
import pfe.example.Entites.Project;
import pfe.example.Entites.Utilisateur;

@Service
public class ListenoirService {
private Project project;
@Autowired
    ProjectRepository projectRepository;

@Autowired
    UtilisateurRepository utilisateurRepository;
@Autowired
    PorteurRepository porteurRepository;
@Autowired
    ContibuteurRepository contibuteurRepository;

public void AddUtilisateur(Utilisateur utlisateur){

// utilisateurRepository.save(utlisateur);

}

public void Deletemodurateur(Long idmoderateur){
   utilisateurRepository.deleteById( idmoderateur);
}
public void Deleteporteur(Long idporteur){
        utilisateurRepository.deleteById( idporteur);
    }




}
