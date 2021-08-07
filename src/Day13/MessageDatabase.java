package Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    public static List<Message> getMessages(){
        for (int i = 0; i < messages.size(); i++) {
            messages.get(i);
        }
        return messages;
    }
    public static void showDialog(User u1, User u2) {
        //пройтись циклом по базе данных сообщений (messages) и получить сообщение (messages.get())
        //если у сообщения поля sender = u1 и receiver = u2 или sender = u2 и receiver = u1, то выводим через запятую сообщения
        for (int i = 0; i < messages.size(); i++) {
            Message m = messages.get(i);
            if ((m.getSender().equals(u1) && m.getReceiver().equals(u2)) || (m.getSender().equals(u2) && m.getReceiver().equals(u1))){
                System.out.println(m);
            }
        }
    }
}
