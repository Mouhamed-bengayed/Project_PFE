package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.CompteRepository;

@Service
public class CompteService {
    @Autowired
    CompteRepository compteRepository;
    public void getAllCompte(){
        compteRepository.findAll();
    }

}
