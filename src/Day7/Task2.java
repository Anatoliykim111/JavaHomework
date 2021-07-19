package Day7;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int min = 90;
        int diff = Player.MAX_STAMINA - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;
        Player player1 = new Player(i);
        Player player2 = new Player(i);
        Player player3 = new Player(i);
        Player player4 = new Player(i);
        Player player5 = new Player(i);
        Player player6 = new Player(i);

        for (int x = 0; x < i; x++){
            player1.run();
        }
        Player.info();
    }
}
