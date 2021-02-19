package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.*;

import pfe.example.Entites.Message;

@Service
public class PorteurService {

    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    CategorieRepository categorieRepository;
    @Autowired
    CommontaireRepository commontaireRepository;

    @Autowired
    MessageRepository messageRepository;
   //public Project addproject(Project newproject){}

      // projectRepository.save(newproject);


   public void getAllcategorie(){
       categorieRepository.findAll();
   }
   public void getAllproject(){projectRepository.findAll();}
   public void deleteproject(long  id){
       ProjectRepository.deleteById(id);
   }
   public void getAllcommontaire(){ commontaireRepository.findAll(); }

  public void Addmessages(Message message){
  messageRepository.save(message);
  }

}
