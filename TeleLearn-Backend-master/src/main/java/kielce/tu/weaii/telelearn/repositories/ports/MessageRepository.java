package kielce.tu.weaii.telelearn.repositories.ports;

import kielce.tu.weaii.telelearn.models.Message;

import java.util.List;

public interface MessageRepository {

    Message save(Message message);

    List<Message> getUserMessages(Long userId);

    List<Message> getConversation(Long user1Id, Long user2Id);

    void setConversationAsRead(Long receiverId, Long senderId);
}
