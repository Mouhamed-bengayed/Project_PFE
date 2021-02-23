package pfe.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.Dao.MessageRepository;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;


    public void getAllMessages(){
        messageRepository.findAll();
    }

}
