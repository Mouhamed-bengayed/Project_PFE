package pfe.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.demo.Dao.CompteRepository;
import pfe.example.Entites.*;
import pfe.example.demo.Entites.Compte;

import java.util.List;

@Service
public class CompteService {
    @Autowired
    CompteRepository compteRepository;

    public List<Compte> getAllCompte(){
        compteRepository.findAll();
        return getAllCompte();
    }


}
