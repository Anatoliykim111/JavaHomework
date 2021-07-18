package Day6;

public class Task6 {
    public static void main(String[] args) {
        //Задание 1
        Car car1 = new Car();

        car1.setCarParameters(1995, "yellow", "Toyota");
        car1.info();
        int yearDifference = car1.yearDifference(2021);
        System.out.println(yearDifference);

        //Задание 2
        Airplane airplane1 = new Airplane("Airbus", 2007, 74, 73000);
        airplane1.setYear(2008);
        airplane1.setLength(90);
        airplane1.fillUp(30);
        airplane1.fillUp(50);
        airplane1.info();

        //Задание 3
        Teacher teacher1 = new Teacher("Tatyana", "Mathematics");
        Teacher teacher2 = new Teacher("Olga", "English Language");
        Student student1 = new Student("Ivan");
        Student student2 = new Student("Misha");

        teacher1.evaluate(student1);
        teacher2.evaluate(student2);
        teacher1.evaluate(student2);
        teacher2.evaluate(student1);
    }
}
