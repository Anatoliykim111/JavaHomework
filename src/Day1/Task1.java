package Day1;

public class Task1 {
    public static void main(String[] args) {
        //Задание 1
        int i = 0;
        while (i < 10){
            System.out.print("JAVA ");
            i++;
        }

        System.out.println();

        //Задание 2
        for (int a = 0; a < 10; a++){
            System.out.print("JAVA ");
        }

        System.out.println();


        //Задание 3
        for (int a = 0; a < 10; a++){
            System.out.println("JAVA ");
        }
        System.out.println();


        //Задание 4
        int year = 1980;
        while (year < 2021){
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }
        System.out.println();

        //Задание 5
        for (int x = 1980; x < 2021; x +=4){
            System.out.println("Олимпиада " + x + " года");
        }
        System.out.println();

        //Задание 6
        int k = 8;
        int l = 1;
        while (l < 10){
            System.out.println(l + " * " + k + " = " + l * k);
            l++;
        }
    }
}
