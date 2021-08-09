package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        File file = new File("test");
        try {
            System.out.println(printSumDigits(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException i){
            System.out.println("Некорректный входной файл");
        }
    }

    public static int printSumDigits (File file) throws FileNotFoundException, IllegalArgumentException {
        Scanner scanner = new Scanner(file);
        int sum = 0;
        int counter = 0;
        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            sum = number + sum;
            counter++;
        }

        if (counter != 10){
            throw new IllegalArgumentException();
        }

        scanner.close();
        return sum;
    }
}
