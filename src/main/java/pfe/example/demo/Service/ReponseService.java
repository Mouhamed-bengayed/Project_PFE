package pfe.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.demo.Dao.MessageRepository;
import pfe.example.demo.Entites.Message;

@Service
public class ReponseService {
    @Autowired
    MessageRepository messageRepository;

    public void reponseMessage(Message message) {




    }
}
