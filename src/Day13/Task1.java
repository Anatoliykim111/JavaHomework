package Day13;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Hello, user2!");
        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "It's fine, thank you!");
        user2.sendMessage(user1, "Going home, right now");
        user2.sendMessage(user1, "What are you doing?");
        user3.sendMessage(user1, "Working now");
        user3.sendMessage(user1, "Talk to you later");
        user3.sendMessage(user1, "Could you please call me 9.pm?");
        user1.sendMessage(user3, "Ok");
        user1.sendMessage(user3, "Call you later");
        user1.sendMessage(user3, "See ya");
        user3.sendMessage(user1, "Bye");

        MessageDatabase.showDialog(user3, user1);
    }
}
