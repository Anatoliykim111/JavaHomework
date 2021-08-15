package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            File file1 = new File("file1");
            PrintWriter pw = new PrintWriter(file1);
            for (int i = 0; i <1000; i++){
                pw.println((int) (Math.random() * 100));
            }
            pw.close();

            Scanner scanner = new Scanner(file1);
            File file2 = new File("file2");
            PrintWriter pw1 = new PrintWriter("file2");
            double sum = 0;
            int counter = 0;
            while (scanner.hasNextLine()){
                double number = Double.parseDouble(scanner.nextLine());
                sum += number;
                counter ++;

                if (counter == 20){
                    pw1.println(sum/20.0);
                    sum = 0;
                    counter = 0;
                }
            }
            pw1.close();
            System.out.println(printResult(file2));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static int printResult(File file){
        try {
            Scanner scannerInFile = new Scanner(file);
            double sum = 0;
            while (scannerInFile.hasNextLine()){
                sum +=Double.parseDouble(scannerInFile.nextLine());
            }
            return (int) sum;
        } catch (FileNotFoundException e) {
            System.out.println("Файл длс считывания не найден");
            return 0;
        }
    }
}

