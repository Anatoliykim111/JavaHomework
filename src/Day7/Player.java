package Day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    static int countPlayers = 0;

    public Player(int stamina){
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
        System.out.println(countPlayers);
    }

    public int getStamina() {
        return stamina;
    }
    public static int getCountPlayers(){
        return countPlayers;
    }

    public int run(){
        if (stamina > MIN_STAMINA){
            stamina--;
        }
        if (stamina == MIN_STAMINA){
            countPlayers--;
        }
        return stamina;
    }

    public static void info() {
        int sum = 6;
        if(countPlayers >= 6){
            System.out.println("На поле нет свободных мест");
        }
        else if (countPlayers >= 0 && countPlayers <= 1){
            System.out.println("Команды неполные. На поле еще есть " + (sum - countPlayers) +  " свободных мест");
        }
        else if (countPlayers <= 4 && countPlayers >= 2){
            System.out.println("Команды неполные. На поле еще есть " + (sum - countPlayers) +  " свободных места");

        }
        else if (countPlayers == 5){
            System.out.println("Команды неполные. На поле еще есть " + (sum - countPlayers) +  " свободное место");
        }
    }
}
