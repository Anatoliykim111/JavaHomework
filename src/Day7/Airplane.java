package Day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.length > airplane2.length){
            System.out.println("Самолет 1 длиннее Самолета 2");
        }
        else if (airplane1.length == airplane2.length){
            System.out.println("Самолеты равны по длине");
        }

        else{
            System.out.println("Самолет 2 длиннее Самолет 1");
        }
    }

    void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке " + fuel);
    }

    int fillUp(int n){
        fuel = fuel + n;
        return fuel;
    }

    public String setProducer(String producer){
        this.producer = producer;
        return producer;
    }

    public int setYear(int year){
        this.year = year;
        return year;
    }

    public int setLength(int length){
        this.length = length;
        return length;
    }

    public int setWeight(int weight){
        this.weight = weight;
        return weight;
    }

    public int setFuel(int fuel){
        this.fuel = fuel;
        return fuel;
    }

    public int getFuel() {
        return fuel;
    }
}
