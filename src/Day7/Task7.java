package Day7;

public class Task7 {
    public static void main(String[] args) {
        //Задание 1
        Airplane airplane1 = new Airplane("Airbus", 2014, 80, 75000);
        Airplane airplane2 = new Airplane("Boeing", 2010, 78, 74000);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
