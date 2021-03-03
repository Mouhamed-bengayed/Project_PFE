package pfe.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfe.example.demo.Dao.MessageRepository;
import pfe.example.demo.Entites.Message;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;


    public List<Message> getAllMessages(){
        messageRepository.findAll();
        return getAllMessages();
    }

}
