package Day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions; //В этом списке должны храниться те пользователи, на которых подписан пользователь

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    //подписывает пользователя на пользователя user
    public void subscribeTo (User user){
        user.getSubscriptions().add(this);
    }
    //возвращает True, если пользователь подписан на пользователя user и False, если не подписан.
    public boolean isSubscribed (User user){
        for (int i = 0; i < this.getSubscriptions().size(); i++){
            if (user == this.getSubscriptions().get(i)){
                return true;
            }
        }
        return false;
    }
    //возвращает True, если пользователь user является другом и False, если пользователь user не является другом.
    //Подумайте, что такое дружба в контексте соц сетей. (Оба должны быть добавлены в подписчики друг другу, в таком случае наверно лучше сделать static)
    public boolean isFriend(User user){
        for (int i = 0; i < user.getSubscriptions().size(); i++){
            if (this == user.getSubscriptions().get(i) && this.getSubscriptions().get(i) == user){
                return true;
            }
        }
        return false;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}
