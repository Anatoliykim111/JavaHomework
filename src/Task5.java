public class Task5 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCarParameters(1999, "red", "toyota");
        car1.getCarParameters();
        Motorbike motorbike1 = new Motorbike(2000, "blue", "kawasaki");
        Motorbike motorbike2 = new Motorbike(1993, "yellow", "yamaha");
        motorbike1.getMotorbikeParameters();
        motorbike2.getMotorbikeParameters();
    }
}
