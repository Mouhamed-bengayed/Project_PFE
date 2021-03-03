package pfe.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pfe.example.demo.Entites.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {
}
