package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");
        System.out.printf(printResult(file) + " --> %.3f", printResult(file));
    }

    public static double printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String [] numbers = line.split(" ");
            double sum = 0.0;
            int counter = 0;
            for (String number : numbers){
                sum += Double.parseDouble(number);
                counter++;
            }
            return sum / counter;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return 0;
        }
    }
}
